package gr11review.part1;
import java.io.*;

/**
 * A program Review5.java that requests a yearly investment amount, annual
 * compound interest rate, and the target amount of the investment. The program then
 * outputs the number of years it will take to reach that investment amount. 
 * 
 * @author: Kayla Jin
 */

public class Review5 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
       
        // Keyboard object for user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        /*
         * Variables to store the yearly invested amount, compound interest rate, the
         * target amount, the total amount of the investment each year, and the time it takes
         * to reach the target amount.
         */
        double dblYearlyInv;
        double dblIntRate;
        double dblTarg;
        double dblTotal = 0;
        int intTime = 0;
        
        // Receive user input
        System.out.print("Enter the yearly invested amount: ");
        dblYearlyInv = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblIntRate = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the target amount: ");
        dblTarg = Double.parseDouble(keyboard.readLine());

        // Calculates the time it takes to reach the target amount
        while (dblTarg > dblTotal) {
            dblTotal = (dblTotal + dblYearlyInv) * (1 + dblIntRate/100);
            intTime ++;
        }

        // Outputs the result
        System.out.println("The target amount will be earned in " + intTime + " years.");

    }
}