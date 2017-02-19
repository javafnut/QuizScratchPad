package com.ibexsys.thread;

/**
 * Created by tj on 2/16/17.
 */
public class MyThread extends Thread {

    String sa;

    public MyThread(String s) {
        this.sa = s;
    }

    public void run() {
        synchronized (sa) {
            while (!sa.equals("Done")) {
                try {
                    sa.wait();
                } catch (InterruptedException ie) {
                }

            }
        }

        System.out.print(sa);
    }

}
