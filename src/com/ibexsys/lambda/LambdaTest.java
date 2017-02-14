package com.ibexsys.lambda;

/**
 * Created by tj on 2/10/17.
 */
public class LambdaTest {

    public static void main(String[] args) {
        // write your code here
        LambdaTest lambdaTest = new LambdaTest();
        Runnable r = () -> System.out.println("hello world");
        HelloLambda hello = () -> System.out.println("hello world");
        LambdaMsg msg = (String s) -> System.out.println(s);

        r.run();
        hello.perform();
        msg.perform("FooBarHere");
    }
}