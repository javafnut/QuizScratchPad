package com.ibexsys.pad1;

/**
 * Created by tj on 2/16/17.
 */
public class WhichArray {

    public void WhichArrayTest(Object x) {

        if (x instanceof int[]) {
            int[] n = (int[]) x;
            for (int i = 0; i < n.length; i++) {
                System.out.println("Integers - " + n[i]);
            }
        }

        if (x instanceof String[]) {
            System.out.println("Array Of Strings");
        }
    }


}
