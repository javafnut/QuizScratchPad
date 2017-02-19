package com.ibexsys.thread;

/**
 * Created by tj on 2/16/17.
 */
public class Test {

    private static String sa = new String("Not Done");

    public static void main(String[] args) {

        Thread t1 = new MyThread(sa);
        t1.start();

        synchronized (sa) {
            sa = new String("Done");
            sa.notify();
        }
    }


}
