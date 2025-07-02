package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "javascript", "html", "css", "js");

        //ALL WORDS UPPERCASE BY THIS LINE
        List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        //FIRST WORD UPPERCASE BY THIS LINE
        List<String> firstUpperLetter = list.stream().map(s-> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()).collect(Collectors.toList());




        System.out.println(firstUpperLetter);
    }
}
