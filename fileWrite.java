import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWrite {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        try{
            FileWriter writer = new FileWriter("example.txt");
            System.out.println("What's your name?");
            String name = input.nextLine();

            System.out.println("What's your favorite food?");
            String faveFood = input.nextLine();

            System.out.println("What is you current year?");
            int currentYear = input.nextInt();

            writer.write("Name: " + name + "\n");
            writer.write("Favorite Food: " + faveFood + "\n");
            writer.write("Current Year: " + currentYear + "\n");

            writer.close();
            System.out.println("Succesfully wrote to the file.");

        } catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        input.close();
    }
}
