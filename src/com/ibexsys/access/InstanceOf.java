package com.ibexsys.access;

/**
 * Created by tj on 2/13/17.
 */
public class InstanceOf {


    public static void Test(Object x) {
        if (x instanceof int[]) {
            int[] n = (int[]) x;

            for (int i = 0; i < n.length; i++) {
                System.out.println("integers" + n[i]);
            }
        }


        if (x instanceof String) {
            System.out.println("Arrays of Strings");

        }


    }

    public static void main(String[] args) {

        InstanceOf i = new InstanceOf();
        System.out.println(A.name);
        System.out.println(A.s1);


    }

}
