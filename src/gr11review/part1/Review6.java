package gr11review.part1;
import java.io.*;
import java.text.*;

/**
 * A program Review6.java that takes in prices until the user enters zero.
 * The program then outputs the subtotal, tax, and total.
 * 
 * @author: Kayla Jin
 */

public class Review6 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        
        // Formats the numbers
        NumberFormat numberFormat = new DecimalFormat("#,##0.00");

        // Keyboard object to read user input
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        // Variables to store the prices of each item and the subtotal
        double dblPrice = 1;
        double dblSubTotal = 0;

        // Takes in the prices from the user
        while (dblPrice != 0) {
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblSubTotal += dblPrice;
        }

        // Prints out the results
        System.out.println("Subtotal: $" + numberFormat.format(dblSubTotal));
        System.out.println("Tax: $" + numberFormat.format(dblSubTotal * 0.13));
        System.out.println("Total: $" + numberFormat.format(dblSubTotal * 1.13));
    }
}