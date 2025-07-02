package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonEmptyStringFind {
    public static void main(String[] args) {
            List<String> list = Arrays.asList(" ", "  ", "Klawa", "stream");

            Optional<String> firstNonEmpty = list.stream()
                    .map(String::trim) // removes spaces
                    .filter(s -> !s.isEmpty()) // filters out empty strings
                    .findFirst(); // returns the first match

            firstNonEmpty.ifPresentOrElse(
                    value -> System.out.println("First non-empty string: " + value),
                    () -> System.out.println("No non-empty string found.")
            );
    }
}
