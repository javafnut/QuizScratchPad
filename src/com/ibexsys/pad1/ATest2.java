package com.ibexsys.pad1;

/**
 * Created by tj on 2/8/17.
 */

import java.util.concurrent.atomic.AtomicInteger;

public class ATest2 {


    int val = 10;
    int x;

    ATest2(int i) {
        val = i;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {
        ATest2 at = new ATest2(5);
        System.out.println(at.value.decrementAndGet());
    }


}
