package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(("(\\bto\\b)|(\\bin\\b)|(\\bas\\b)|(\\bsome\\b)"));
        String input = "Until now, we've only used the test harness to create Pattern objects in their most basic form. This section explores advanced techniques such as creating patterns with flags and using embedded flag expressions. It also explores some additional useful methods that we haven't yet discussed.";
        Matcher matcher = pattern.matcher(input);
        String java = matcher.replaceAll("Java");
        System.out.println(input);
        System.out.println(java);

    }
}
