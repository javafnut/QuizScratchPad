package com.ibexsys.pad1;

/**
 * Created by tj on 2/12/17.
 */

import java.lang.Math;


enum Operator {

    PLUSONE {
        public int operate(int x) {
            return ++x;
        }
    },
    MINUSONE {
        public int operate(int x) {
            return --x;
        }
    },
    ABS {
        public int operate(int x) {
            return Math.abs(x);
        }
    };

    abstract int operate(int x);


}


public class Enum {

    public static void main(String[] args) {

        int x = -10;

        for (Operator o : Operator.values()) {
            System.out.println(o + " of " + x + " = " + o.operate(x));
        }


    }


}
