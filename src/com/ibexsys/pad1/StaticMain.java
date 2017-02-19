package com.ibexsys.pad1;

/**
 * Created by tj on 2/15/17.
 */
public class StaticMain {

    static int i = 2;

    public static void main(String[] args) {
        int array[] = new int[i];
        array[1] = 66;
        System.out.println(array[1]);

        long[] foo = {1};
        Object o = foo;
    }

}
