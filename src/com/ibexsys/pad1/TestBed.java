package com.ibexsys.pad1;

import java.io.Console;
import java.util.Arrays;

/**
 * Created by tj on 2/8/17.
 */

class MyException extends Exception {
}

public class TestBed {


    public void objectTest() {
        Object[] myObjects = {
                new Integer(12),
                new String("Foo"),
                new Integer(5),
                new Boolean(true)
        };


        Arrays.sort(myObjects);
    }

    public void ioTest() {
        StringBuilder pword = new StringBuilder("");
        Console con = System.console();

        String name = con.readLine("User Name:");
        char pass[] = con.readPassword("Password:");

        for (char c : pass) {
            pword.append(c);
        }

        System.out.println(name + " " + pword.toString());
    }


    public String sayHello() {
        return "FooBar Says Hello";
    }

}
