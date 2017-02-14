package com.ibexsys.pad1;

/**
 * Created by tj on 2/9/17.
 */
public class Loops {

    public void test() {
        int[][] array2D = new int[3][2];
        int count = 0;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                count++;
            }
        }

        System.out.println("count " + count);
    }

    public void test1() {
        int x = 20;

        while (x > 0) {
            do {
                x -= 2;
                System.out.println(x);
            } while (x > 5);
            x--;
            System.out.println(x);


        }
    }

    public void test2() {

    }


    public static void main(String[] args) {
        // write your code here

        Loops loops = new Loops();
        loops.test1();
    }


}
