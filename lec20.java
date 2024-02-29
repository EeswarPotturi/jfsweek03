import java.util.*;
public class Lecture18_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Convert sentence to lowercase for case-insensitive counting (optional)
        sentence = sentence.toLowerCase();

        // Loop through each character in the sentence
        for (char ch : sentence.toCharArray()) {
            // Check if the character is a letter, space, or punctuation
            if (Character.isLetter(ch) || Character.isSpaceChar(ch) || Character.isPunctuation(ch)) {
                // If the character is already in the map, increment its count
                if (charCounts.containsKey(ch)) {
                    charCounts.put(ch, charCounts.get(ch) + 1);
                } else {
                    // Otherwise, add it to the map with a count of 1
                    charCounts.put(ch, 1);
                }
            }
        }

        // Print the character frequencies
        System.out.println("\nCharacter frequencies:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}