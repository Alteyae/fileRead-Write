import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileRead {
    // Method to read file and return lines as array
    public static String[] readFileToArray(String filename) throws IOException {
        ArrayList<String> linesList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            linesList.add(line);
        }

        reader.close();

        // Convert ArrayList to String array
        String[] linesArray = new String[linesList.size()];
        return linesList.toArray(linesArray);
    }

    // Method to display array contents using loop
    public static void displayLines(String[] lines) {
        System.out.println("File Contents:");
        System.out.println("==============");

        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }
    }

    // Method to count specific items in the array
    public static int countLinesContaining(String[] lines, String keyword) {
        int count = 0;

        for (String line : lines) {
            if (line.toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        try {
            // Read file into array using method
            String[] fileLines = readFileToArray("example.txt");

            // Display all lines using method
            displayLines(fileLines);

            // Display statistics
            System.out.println("\nStatistics:");
            System.out.println("Total lines read: " + fileLines.length);

            // Example: Count lines containing certain keywords
            if (fileLines.length > 0) {
                int favoriteCount = countLinesContaining(fileLines, "favorite");
                System.out.println("Lines containing 'favorite': " + favoriteCount);
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
