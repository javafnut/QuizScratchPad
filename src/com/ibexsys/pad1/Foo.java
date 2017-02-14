package com.ibexsys.pad1;

/**
 * Created by tj on 2/13/17.
 */
public class Foo {
    int x = 5;

    public static void main(String[] args) {

        Foo foo = new Foo();
        Class c = foo.getClass();

        try {
            System.out.println(c.getMethod("getNumber", null).toString());
            System.out.println(c.getDeclaredMethod("setNumber", null).toString());
        } catch (NoSuchMethodException | SecurityException e) {

        }

    }

    public Integer getNumber() {
        return 2;
    }

    public void setNumber(Integer e) {

    }
}
