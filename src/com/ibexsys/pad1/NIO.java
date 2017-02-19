package com.ibexsys.pad1;

/**
 * Created by tj on 2/8/17.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO implements AutoCloseable {

    public void close() {

    }

    public static void main(String[] args) {

        Path path = Paths.get("/tmp/todd");

        try (NIO nio = new NIO()) {

        }

        try {
            Files.delete(path);

        } catch (NoSuchFileException E) {
            System.err.format("no such file or directory");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis;
//        try (fis = new FileInputStream("Java.txt")){
//
//        }

    }


}
