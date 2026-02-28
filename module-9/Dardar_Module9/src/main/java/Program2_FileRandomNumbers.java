package com.example.dardar_module9;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Program2_FileRandomNumbers {

    public static void main(String[] args) {

        Path filePath = Path.of("data.file"); // created in the project run directory
        Random random = new Random();

        // Write (or append) 10 random integers separated by spaces
        try (BufferedWriter writer = Files.newBufferedWriter(
                filePath,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        )) {

            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // 0-99
                writer.write(num + " ");
            }
            writer.newLine();

            System.out.println("10 random numbers were added to: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
            return;
        }

        // Reopen, read, and display the file contents
        try {
            String contents = Files.readString(filePath);
            System.out.println("\nContents of data.file:");
            System.out.println(contents);

        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}