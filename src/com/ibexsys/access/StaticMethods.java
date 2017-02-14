package com.ibexsys.access;

/**
 * Created by tj on 2/13/17.
 */


public class StaticMethods {

    static int total = 10;

    public void call() {
        int total = 10;

    }

    public static void xx(PassTestStatic p) {
        p.i = 10;
    }

    public static void yy(PassTestStatic p) {
        p = new PassTestStatic();
    }

    public static void main(String[] args) {

        System.out.println("abc" == "abc");
        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc") == "abc");
        System.out.println(new String() == new String());
        System.out.println("abc".equals("abc"));


//        PassTestStatic passTest = new PassTestStatic();
//
//        xx(passTest);
//        System.out.println(PassTestStatic.i);
//
//        yy(passTest);
//        System.out.println(PassTestStatic.i);


    }


}
