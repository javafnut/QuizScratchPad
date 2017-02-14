package com.ibexsys.pad1;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by tj on 2/13/17.
 */
public class VectorTest {

    public static void main(String[] args) {

        Vector v = new Vector<Integer>();
        v.add(18);
        v.add(20);
        v.add(12);


        ArrayList<Double> a = new ArrayList<Double>();

        a.add(new Integer(4).doubleValue());
        System.out.println(a);

//        for(Integer i: Integer.valueOf(v))
//            System.out.println(i + " ");

    }

}
