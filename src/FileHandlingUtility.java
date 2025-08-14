
import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "example.txt";

        try {
            // Write to file
            FileWriter writer = new FileWriter(filename);
            writer.write("This is the original content of the file.");
            writer.close();
            System.out.println("File written successfully.");

            // Read from file
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("\nReading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

            // Modify file
            FileWriter modifier = new FileWriter(filename, true); // append mode
            modifier.write("\nThis line is added later.");
            modifier.close();
            System.out.println("\nFile modified successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
