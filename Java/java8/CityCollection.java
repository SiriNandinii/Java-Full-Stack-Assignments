package java8;

import java.util.Arrays;
import java.util.List;

public class CityCollection {

    public static void main(String[] args) {

        List<String> cities =
                Arrays.asList("Hyderabad","Delhi","Mumbai","Chennai","Bangalore");

        System.out.println("Lambda Expression");

        cities.forEach(city -> System.out.println(city));

        System.out.println("\nMethod Reference");

        cities.forEach(System.out::println);

        System.out.println("\nSorted Cities");

        cities.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nUppercase Cities");

        cities.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}