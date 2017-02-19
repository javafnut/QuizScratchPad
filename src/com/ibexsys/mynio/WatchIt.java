package com.ibexsys.mynio;

import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * Created by tj on 2/16/17.
 */
public class WatchIt {

    public static void main(String[] args) {

        Path dir = Paths.get("/tmp");

        do {
            try {
                WatchService watch = dir.getFileSystem().newWatchService();
                dir.register(watch, ENTRY_DELETE, ENTRY_MODIFY);
                WatchKey key = watch.take();

                List<WatchEvent<?>> events = key.pollEvents();

                for (WatchEvent event : events) {

                    if (event.kind() == ENTRY_CREATE) {
                        System.out.println("A File Created");
                    }

                    if (event.kind() == ENTRY_DELETE) {
                        System.out.println("A File Deleted");
                    }

                    if (event.kind() == ENTRY_MODIFY) {
                        System.out.println("A File Modified");
                    }


                }

            } catch (Exception e) {

                System.out.println("Error !!" + e.getMessage());
                System.out.println("Error !!" + e.getStackTrace());

            }

        } while (true);
    }


}
