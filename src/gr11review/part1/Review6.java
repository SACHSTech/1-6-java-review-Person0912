package gr11review.part1;
import java.io.*;
import java.text.*;

public class Review6 {
    public static void main(String[] args) throws IOException {
        
        NumberFormat numberFormat = new DecimalFormat("#,##0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        double dblPrice = 1;
        double dblSubTotal = 0;

        while (dblPrice != 0) {
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblSubTotal += dblPrice;
        }
        
        System.out.println("Subtotal: $" + numberFormat.format(dblSubTotal));
        System.out.println("Tax: $" + numberFormat.format(dblSubTotal * 0.13));
        System.out.println("Total: $" + numberFormat.format(dblSubTotal * 1.13));
    }
}