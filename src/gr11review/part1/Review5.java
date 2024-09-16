package gr11review.part1;
import java.io.*;

public class Review5 {
    public static void main(String[] args) throws IOException {
       
        // WHICH MATH FORMULA IS THIS USING AHHHHH
        double dblInvested;
        double dblIntRate;
        double dblTarg;
        double dblTime;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the yearly invested amount: ");
        dblInvested = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblIntRate = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the target amount: ");
        dblTarg = Double.parseDouble(keyboard.readLine());

        dblTime = Math.log(dblTarg / dblInvested) / Math.log(1 + dblIntRate);

        System.out.println("The target amount will be earned in " + dblTime + " years.");

    }
}