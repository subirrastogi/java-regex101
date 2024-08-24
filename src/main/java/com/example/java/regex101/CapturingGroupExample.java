package com.example.java.regex101;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingGroupExample {

    public static void main(String[] args) {

    }

    public List<String> run (String inputString) {
        //Pattern pattern = Pattern.compile("_D_>>([{\\w}\\s:\\d]+)<<_F_");
        Pattern pattern = Pattern.compile("_D_>>(?:[\\w\\s]*)([{\\w}\\s:]+)<<_F_");
        Matcher matcher = pattern.matcher(inputString);

        List<String> r = matcher.results()
                                .map(m -> m.group(1))
                                .toList();

        //r.forEach(System.out::println);

        /*while (matcher.find()) {
            String r = matcher.group(1);
            System.out.println("found the match - " + r);

            result.add(r);
        }*/

        //System.out.println("matcher - {}" + matcher.matches());

        return r;
    }
}
