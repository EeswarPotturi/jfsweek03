import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture22_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the list
        System.out.print("Enter integers separated by spaces or commas: ");
        String input = scanner.nextLine();

        // Create an ArrayList to store the filtered numbers
        List<Integer> filteredNumbers = new ArrayList<>();

        // Split the input into a String array (handles both spaces and commas)
        String[] inputTokens = input.split("[, ]+");

        // Loop through each token
        for (String token : inputTokens) {
            try {
                // Convert the token to an integer and check if it's even
                int number = Integer.parseInt(token);
                if (number % 2 == 0) {
                    filteredNumbers.add(number);
                }
            } catch (NumberFormatException e) {
                // Ignore non-numeric input
                System.out.println("Ignoring non-numeric input: " + token);
            }
        }

        // Print the filtered list
        System.out.println("\nFiltered integers and even numbers: " + filteredNumbers);
    }
}