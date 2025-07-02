package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.List;

public class ListIterate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "HTML", "CSSS", "JS");

        list.forEach(item -> System.out.println(item));
    }
}
