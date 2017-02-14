package com.ibexsys.pad1;

/**
 * Created by tj on 2/8/17.
 */
public class RunTest implements Runnable {

    public static void main(String[] args) {
        RunTest rt = new RunTest();
        Thread t = new Thread(rt);
    }

    public void run() {
        System.out.println("running");
    }

    public void go() {
        start(1);
    }

    public void start(int i) {
    }


}
