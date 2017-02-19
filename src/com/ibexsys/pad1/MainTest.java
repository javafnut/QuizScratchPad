package com.ibexsys.pad1;

import java.time.LocalDate;

/**
 * Created by tj on 2/15/17.
 */
public class MainTest {

    public static void main(int[] i) {
        System.out.println("Main 1 ");
    }

    public static void main(String c) {
        System.out.println("Main 2");
    }

    public static void main(char c) {
        System.out.println("Main 3");
    }


    public static void main(String[] args) {

//        int[]a = {3,2,1,0};
//        int y = a.length;
//
//        while (y >= 0){
//            System.out.println(a[--y]);
//        }
        int x = 20;
        int y = 13;


        StringBuilder foo = new StringBuilder("Foo");
        StringBuilder foo2 = new StringBuilder("Foo");
        String f = new String("Foo");


        System.out.println(f.equals(foo2));
        System.out.println(f.toString().equals(foo2.toString()));
        foo.append("Barr");
        System.out.println(foo.length());
        System.out.println(foo.capacity());

        int arr[][] = {{1, 3, 5}, {7, 8}};

        out:
        for (int[] a : arr) {
            for (int i : a) {

            }
        }

        Double d1 = 10.0 / 0.0;
        System.out.println(d1.isInfinite());


//        System.out.print("" + x + y + " ");
//        System.out.print(x + y + " ");
//        System.out.print(x + " " + y);
//
//        for (;; System.out.println("a"));

        String xx = "sss";

        StringBuffer s = new StringBuffer("ss");

        LocalDate id = LocalDate.of(2010, 10, 10);


    }


}
