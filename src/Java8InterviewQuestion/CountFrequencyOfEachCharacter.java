package Java8InterviewQuestion;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "I am Devanshu Verma, A Business Tycoon. Published in Forbes.";

        Map<Character, Long> charCountMap =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }
}
