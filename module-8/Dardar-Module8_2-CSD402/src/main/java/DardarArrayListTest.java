package com.example.dardarmodule8_2csd402;

import java.util.ArrayList;
import java.util.Scanner;

public class DardarArrayListTest {

    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int current = (Integer) list.get(i);
            if (current > largest) {
                largest = current;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 0 to stop):");

        while (true) {
            System.out.print("Number: ");

            while (!input.hasNextInt()) {
                System.out.print("Please enter a whole number: ");
                input.next();
            }

            int value = input.nextInt();
            numbers.add(value); // includes 0

            if (value == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);

        System.out.println("\nArrayList contents: " + numbers);
        System.out.println("Largest value in the ArrayList: " + largestValue);

        input.close();
    }
}
