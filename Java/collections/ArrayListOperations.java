package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original ArrayList:");
        System.out.println(colors);

        // Iterate
        System.out.println("\nIterating through ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Insert at first position
        colors.add(0, "White");
        System.out.println("\nAfter inserting White at first position:");
        System.out.println(colors);

        // Retrieve element
        System.out.println("\nElement at index 2:");
        System.out.println(colors.get(2));

        // Update element
        colors.set(3, "Pink");
        System.out.println("\nAfter updating index 3:");
        System.out.println(colors);

        // Remove third element
        colors.remove(2);
        System.out.println("\nAfter removing third element:");
        System.out.println(colors);

        // Search
        System.out.println("\nIs Blue present?");
        System.out.println(colors.contains("Blue"));

        // Sort
        Collections.sort(colors);
        System.out.println("\nSorted ArrayList:");
        System.out.println(colors);

        // Copy
        ArrayList<String> copyList = new ArrayList<>(Collections.nCopies(colors.size(), ""));

        Collections.copy(copyList, colors);

        System.out.println("\nCopied ArrayList:");
        System.out.println(copyList);

        // Shuffle
        Collections.shuffle(colors);
        System.out.println("\nShuffled ArrayList:");
        System.out.println(colors);

        // Reverse
        Collections.reverse(colors);
        System.out.println("\nReversed ArrayList:");
        System.out.println(colors);

        // Extract portion
        List<String> portion = colors.subList(1, 4);

        System.out.println("\nExtracted Portion:");
        System.out.println(portion);

        // Replace second element
        colors.set(1, "Orange");

        System.out.println("\nAfter replacing second element:");
        System.out.println(colors);

    }
}