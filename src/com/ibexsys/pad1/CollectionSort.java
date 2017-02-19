package com.ibexsys.pad1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tj on 2/17/17.
 */
public class CollectionSort {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add("USA");
        a.add("Russia");
        a.add("UK");

        Collections.sort(a);

        System.out.println(a);


    }


}
