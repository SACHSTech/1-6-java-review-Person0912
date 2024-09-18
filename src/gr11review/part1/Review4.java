package gr11review.part1;
import java.io.*;
import java.text.*;

/**
 * A program Review4.java that asks the user how many items they would
 * like to purchase, receives the prices from the user, and then prints 
 * the subtotal, tax, and total.
 * 
 * @author: Kayla Jin
 */

public class Review4 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        
        // Formats the currency
        NumberFormat numberFormat = new DecimalFormat("#,##0.00");

        // Keyboard object to receive user input
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        // Variables to store the number of items and the sub total
        int intNumItems;
        double dblSubTotal = 0;

        // Allows the user to enter the number of items they would like to buy
		System.out.print("How many items do you want to buy? ");
		intNumItems = Integer.parseInt(keyboard.readLine());

        // Allows the user to enter the price for each item
        for (int i = 1; i <= intNumItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblSubTotal += Double.parseDouble(keyboard.readLine());
        }
        
        // Outputs the results
        System.out.println("Subtotal: $" + numberFormat.format(dblSubTotal));
        System.out.println("Tax: $" + numberFormat.format(dblSubTotal * 0.13));
        System.out.println("Total: $" + numberFormat.format(dblSubTotal * 1.13));
    }
}