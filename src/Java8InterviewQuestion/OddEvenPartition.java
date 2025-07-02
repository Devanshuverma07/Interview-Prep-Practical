package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenPartition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        Map<Boolean, List<Integer>> partition = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        // Get even and odd lists
        List<Integer> evenNumbers = partition.get(true);
        List<Integer> oddNumbers = partition.get(false);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);

    }
}
