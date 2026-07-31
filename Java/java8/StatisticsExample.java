package java8;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class StatisticsExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);

        IntSummaryStatistics statistics =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .summaryStatistics();

        System.out.println("Maximum : " + statistics.getMax());
        System.out.println("Minimum : " + statistics.getMin());
        System.out.println("Sum     : " + statistics.getSum());
        System.out.println("Average : " + statistics.getAverage());
    }
}