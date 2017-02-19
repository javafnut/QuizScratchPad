package com.ibexsys.pad1;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by tj on 2/15/17.
 */
public class CutAndPaste {


    public static void main(String[] args) {

        int[] a1 = {2, -1, 4, 5, 3};
        int[] a2 = {2, -1, 4, 5, 3};
        System.out.print((a1 == a2) + " ");

        System.out.print(Arrays.equals(a1, a2) + " ");
        //System.out.print(Arrays.deepEquals(a1, a2) + " " );
        out.println("fooBar");
    }
}