package com.ibexsys.pad1;

import java.util.Arrays;

/**
 * Created by tj on 2/9/17.
 */
public class StringStuff {
    public static void main(String[] args) {

        String[][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};
        Arrays.sort(strings);
        for (String[] str : strings) {
            for (String s : str) {
                System.out.println(s);
            }
        }
        int x = 1;
        System.out.println(x > 1 ? ">" : x < 1 ? "<" : "=");


        // write your code here

    }

}
