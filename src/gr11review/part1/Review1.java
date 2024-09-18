package gr11review.part1;
import java.io.*;

/**
 * A program Review1.java that asks the user the enter a 
 * month number and day and then prints the day of the year.
 * This program assumes it is not a leap year.
 * 
 * @author: Kayla Jin
 */

public class Review1 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {

        // Allows user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Array to store the number of days in each month
        int[] intDaysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Variables to store the inputted month and day number from the user
        int intMonth;
        int intDayNum;

        // Variable to count the number of days in the year
        int intDayOfYear = 0;

        // User month input
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(keyboard.readLine());

        // User day input
        System.out.print("Enter the day number: ");
        intDayNum = Integer.parseInt(keyboard.readLine());
        
        // Adds the number of days in each month
        for (int i = 0; i < intMonth - 1; i++) {
            intDayOfYear += intDaysPerMonth[i];
        }
        
        // Adds the number of days and outputs the number of days in the year
        System.out.println(intDayOfYear += intDayNum);

    }
}