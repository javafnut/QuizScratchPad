package com.ibexsys.pad1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by tj on 2/12/17.
 */
public class Streamz {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        Stream<String> stream = Stream.of("A", "AB", "ABC", "ABCD", "AB");

        String out = stream.filter(s -> s.length() > 2).filter(s -> strings.indexOf("C") > -1).findAny().orElse("None");
        System.out.println(out);


        Stream ds = Stream.of(1, 2, 2, 4, 10);
        // System.out.println(ds.peek(System.out::print).anyMatch(x -> x>= 10));
        //  Stream<String> ste = ds.boxed().map(Integer::toString);


        //strings.stream().forEach(s -> System.out.println(s.length())).forEach(System.out::print);
    }


}
