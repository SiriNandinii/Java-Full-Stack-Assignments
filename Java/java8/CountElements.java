package java8;

import java.util.Arrays;
import java.util.List;

public class CountElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);

        long count = numbers.stream().count();

        System.out.println("Total Elements = " + count);
    }
}