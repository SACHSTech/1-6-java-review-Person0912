package gr11review.part1;
import java.io.*;
import java.text.*;

public class Review4 {
    public static void main(String[] args) throws IOException {
        
        int intNumItems;
        double dblSubTotal = 0;

        NumberFormat numberFormat = new DecimalFormat("#,##0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many items do you want to buy? ");
		intNumItems = Integer.parseInt(keyboard.readLine());

        for (int i = 1; i <= intNumItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblSubTotal += Double.parseDouble(keyboard.readLine());
        }
        
        System.out.println("Subtotal: $" + numberFormat.format(dblSubTotal));
        System.out.println("Tax: $" + numberFormat.format(dblSubTotal * 0.13));
        System.out.println("Total: $" + numberFormat.format(dblSubTotal * 1.13));
    }
}