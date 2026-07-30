package java8;

import java.util.Arrays;
import java.util.List;

public class SortNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(25,10,45,8,98,34,67);

        System.out.println("Sorted Numbers:");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}