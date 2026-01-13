package com.example.waterheatingenergy;

import java.util.Scanner;

public class WaterHeatingEnergy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CSD-402 - Assignment 1.3");
        System.out.println("Energy Needed to Heat Water (Joules)");
        System.out.println("------------------------------------");

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("%nEnergy needed to heat the water: %.2f Joules%n", q);

        input.close();
    }
}
