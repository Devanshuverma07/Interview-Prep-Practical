package Java8InterviewQuestion;

import java.util.List;
import java.util.Optional;

public class OptionalWithLambda {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");

        optional.ifPresent(s-> System.out.println("Value is present: " + s));

    }
}
