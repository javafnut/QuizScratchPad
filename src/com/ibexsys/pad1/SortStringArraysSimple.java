package com.ibexsys.pad1;

import java.util.Arrays;

/**
 * Created by tj on 2/15/17.
 */
public class SortStringArraysSimple {


    public static void main(String[] arg) {

        String[] strings = {"N", "L", "n", "O", "S"};

        //   Object[] strings = {"N", "L", "n", "O", "S"};
        Arrays.sort(strings);

        for (String s : strings) {
            System.out.println(s);
        }

    }

}

