package Java8InterviewQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIteration {

    public static void main(String[] args){

        Map<String, Integer> mpp = new HashMap<>();

        mpp.put("Java" , 8);
        mpp.put("Lambda" , 5);
        mpp.put("Bro" , 8);
        mpp.put("Grow" , 8);
        mpp.put("Net" , 8);

        mpp.forEach((key, value) -> System.out.println(key + ": " + value));



    }
}
