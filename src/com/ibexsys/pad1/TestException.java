package com.ibexsys.pad1;

/**
 * Created by tj on 2/15/17.
 */
public class TestException {

    public int size(Object obj) {
        return ((int[]) obj).length;

    }


    public static void main(String[] args) {

        TestException test = new TestException();
        //test.size((Object) new String ("Foo"));
        test.size(null);

    }

}
