package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(0);
        set2.add(1);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(7);
        set2.add(8);
        set2.add(9);

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union:");
        System.out.println(union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("\nIntersection:");
        System.out.println(intersection);

        // Difference
        Set<Integer> difference = new HashSet<>(union);
        difference.removeAll(intersection);

        System.out.println("\nDifference:");
        System.out.println(difference);

    }
}