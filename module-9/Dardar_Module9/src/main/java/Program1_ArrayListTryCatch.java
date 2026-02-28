package com.example.dardar_module9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1_ArrayListTryCatch {

    public static void main(String[] args) {

        // Minimum of 10 Strings
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Dragonfruit");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        // Print ArrayList using a for-each loop
        System.out.println("ArrayList Items:");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter which element NUMBER you want to see again (1 - " + items.size() + "): ");
        String userInput = scanner.nextLine(); // working with user's String input

        try {
            // Convert the String input to Integer object (auto-boxing happens here)
            Integer indexObj = Integer.valueOf(userInput.trim());

            // Convert Integer object to primitive int (auto-unboxing happens here)
            int index = indexObj;

            // User enters 1..size, but ArrayList uses 0..size-1
            String chosen = items.get(index - 1);

            // Printing inside try (as requested)
            System.out.println("You selected: " + chosen);

        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}