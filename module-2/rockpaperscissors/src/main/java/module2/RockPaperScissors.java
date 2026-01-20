package module2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    // Turns 1/2/3 into words
    private static String toWord(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Computer picks 1, 2, or 3
        int computer = rand.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");

        int user = input.nextInt();

        // Basic input check
        if (user < 1 || user > 3) {
            System.out.println("Oops! You must type 1, 2, or 3.");
            input.close();
            return;
        }

        // Display choices
        System.out.println("Computer chose: " + toWord(computer) + " (" + computer + ")");
        System.out.println("You chose:      " + toWord(user) + " (" + user + ")");

        // Decide winner
        String result;
        if (user == computer) {
            result = "It's a tie!";
        } else if (
                (user == 1 && computer == 3) ||  // Rock beats Scissors
                        (user == 2 && computer == 1) ||  // Paper beats Rock
                        (user == 3 && computer == 2)     // Scissors beats Paper
        ) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
