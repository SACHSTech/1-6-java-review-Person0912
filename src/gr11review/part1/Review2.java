package gr11review.part1;
import java.io.*;

public class Review2 {
    public static void main(String[] args) throws IOException {

        String strOption;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        System.out.print("Choose a menu option: ");
        strOption = keyboard.readLine();

        // Prints out different jokes based on the user's input
        switch (strOption) {
            case "0":
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs.");
                break;
            case "1":
                System.out.println("Why did the computer go to the beach?");
                System.out.println("To surf the web and work on its \"sole\"!");
                break;
            case "2":
                System.out.println("Why did the scarecrow become a successful neurosurgeon?");
                System.out.println("Because he was outstanding in his field and always had a great \"outfit\"!");
                break;
            case "3":
                System.out.println("Why did the math teacher break up with the calculator?");
                System.out.println("Because they just couldn't count on it anymore!");
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }
    }
}