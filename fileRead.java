import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            int data;
            while ((data = reader.read())!= -1) {
                System.out.print((char)data);
            }
            reader.close();
        } catch (IOException e) {
           System.out.println("An error occured.");
           e.printStackTrace();
        }
    }
}
