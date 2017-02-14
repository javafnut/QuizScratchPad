package com.ibexsys.pad1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by tj on 2/13/17.
 */
public class MapTestt {

    public static void main(String[] args) {

        Map<String, String> fruit = new LinkedHashMap<String, String>();
        fruit.put("Apple", "Red");
        fruit.put("Mango", "Yellow");
        fruit.put("Guava", "Green");
        fruit.put("Cherry", "Red");
        fruit.put("Mango", "Red");

        for (String key : fruit.keySet()) {
            System.out.println(key + ":" + fruit.get(key));
        }

    }
}
