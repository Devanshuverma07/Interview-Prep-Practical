package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilterByFirstChar {
    public static void main(String[] args){


        //GIVES CHARACTER STARTING FROM J OUTPUT
        List<String> list = Arrays.asList("Java", "JavaScript", "HTML", "CSSS", "JS");

        List<String> filteredList = list.stream().filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(filteredList);

        //Count the number of strings starting with the letter "A".

        List<String> newlist = Arrays.asList("Apple", "Avocado", "banana", "Apricot", "almond", "cherry");

        long count = newlist.stream()
                .filter(s -> s != null && !s.isEmpty())               // Avoid null or empty strings
                .filter(s -> s.toLowerCase().startsWith("a"))        // Case-insensitive check
                .count();                                            // Count matching elements

        System.out.println("Number of strings starting with 'A': " + count);


        //INDEX WISE FILTER KESE KRE LIKE 2ND INDEX WLE 'A' NIKALE HAI ISS SOLUTION SE
        List<String> indexbylist = Arrays.asList("apple", "mango", "crazy", "data", "banana", "cake");

        List<String> result = indexbylist.stream()
                .filter(s -> s != null && s.length() > 2) // to avoid IndexOutOfBounds
                .filter(s -> Character.toLowerCase(s.charAt(2)) == 'a') // 3rd char = index 2
                .collect(Collectors.toList());

        System.out.println("Strings with 'a' at index 2: " + result);

    }
}
