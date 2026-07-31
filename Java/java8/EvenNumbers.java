package java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 22, 31, 40, 55, 68, 79, 90);

        System.out.println("Even Numbers:");

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}