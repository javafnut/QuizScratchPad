package com.ibexsys.pad1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by tj on 2/19/17.
 */
public class FruitMap {

    public static void main(String[] args) {

        Map<String, String> fruit = new LinkedHashMap<String, String>();

        fruit.put("Apple", "red");
        fruit.put("Mango", "yellow");
        fruit.put("Guava", "green");
        fruit.put("Cherry", "red");
        fruit.put("Mango", "red");

        for (String key : fruit.keySet()) {
            System.out.println(key + ": " + fruit.get(key));
        }


    }


}
