import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWrite {
    // Method to get user input for multiple fields
    public static String[] getUserInput(Scanner input, String[] prompts) {
        String[] responses = new String[prompts.length];

        for (int i = 0; i < prompts.length; i++) {
            System.out.println(prompts[i]);
            responses[i] = input.nextLine();
        }

        return responses;
    }

    // Method to write data to file using arrays
    public static void writeToFile(String filename, String[] labels, String[] data) throws IOException {
        FileWriter writer = new FileWriter(filename);

        for (int i = 0; i < labels.length && i < data.length; i++) {
            writer.write(labels[i] + ": " + data[i] + "\n");
        }

        writer.close();
    }

    // Method to display success message
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        // Define prompts and labels using arrays
        String[] prompts = {
            "What's your name?",
            "What's your favorite food?",
            "What is your current year?",
            "What is your hobby?",
            "What is your favorite color?"
        };

        String[] labels = {
            "Name",
            "Favorite Food",
            "Current Year",
            "Hobby",
            "Favorite Color"
        };

        try {
            // Get user input using method
            String[] userData = getUserInput(input, prompts);

            // Write data to file using method
            writeToFile("example.txt", labels, userData);

            // Display success message
            displayMessage("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        input.close();
    }
}
