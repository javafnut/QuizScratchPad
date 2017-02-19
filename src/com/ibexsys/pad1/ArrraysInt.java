package com.ibexsys.pad1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tj on 2/16/17.
 */
public class ArrraysInt {


    public static void main(String[] args) {
        Integer a[] = {12, 5, 333, 5, 221, 0, 00};

        Arrays.sort(a);
        List l = Arrays.asList(a);
        int in = Arrays.binarySearch(a, 12);
        System.out.println(in);
        System.out.println(a[in]);


    }

}
