import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Lecture20 {

    public static void main(String[] args) throws IOException {
        int elementCount = 0;
        String fileName = "pokemon.csv"; // Replace with the actual file name

        // Open the CSV file
        BufferedReader reader = new BufferedReader(new FileReader("D:\Downloads\pokemon.csv"));

        // Read each line until the end of the file
        while (reader.readLine() != null) {
            elementCount++;
        }

        // Close the reader
        reader.close();

        System.out.println("Total elements (lines) in the CSV file: " + elementCount);
    }
}