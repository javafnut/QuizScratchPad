package com.ibexsys.pad1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tj on 2/13/17.
 */
public class PatternTest {

    public static void main(String[] args) throws Exception {
        Pattern p = Pattern.compile("My");
        Matcher m = p.matcher("My dad and My mom");

        StringBuffer s = new StringBuffer();
        boolean found = m.find();

        while (found) {
            m.appendReplacement(s, "our");
            found = m.find();
        }

        m.appendTail(s);
        System.out.println(s);
    }


}
