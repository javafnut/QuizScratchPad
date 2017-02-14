package com.ibexsys.pad1;

/**
 * Created by tj on 2/12/17.
 */
public class Assert {

    public void math1() throws ArithmeticException {

        for (int x = 0; x < 5; x++) {
            int y = (int) 5 / x;
            System.out.print(x);
        }

    }

    public static void main(String[] args) {

        assert args == null : "No ";
        System.out.println("Good");

        boolean assertEnabled = false;
        assert assertEnabled = true;

        System.out.println("Assertions are - " + (assertEnabled ? "enabled" : "disabled"));

//
//        try {
//
//            new Assert().math1();
//        } catch(Exception e){
//            System.out.println("Exception");
//        } catch (ArithmeticException e){
//            System.out.println("Arithmetic");
//        } finally {
//            System.out.print("Final 1");
//
//
//        }


    }

}
