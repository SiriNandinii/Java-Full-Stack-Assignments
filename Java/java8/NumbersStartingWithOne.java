package java8;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 15, 120, 45, 167, 89, 1000, 215, 19);

        System.out.println("Numbers starting with 1:");

        numbers.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}