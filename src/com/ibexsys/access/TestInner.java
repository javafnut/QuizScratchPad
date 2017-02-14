package com.ibexsys.access;

/**
 * Created by tj on 2/13/17.
 */
public class TestInner {

    //private static int i = 10;
    int i = 10;

    private static void f() {
        //     System.out.println(i);
    }

    TestInner() {
        System.out.print("Outer");
    }

    static class MyInner {
        MyInner() {
            System.out.print("Inner");
            //System.out.print(i);
        }

        void g() {
            f();
        }
    }

    public static void main(String[] args) {
        new TestInner.MyInner();
    }


}
