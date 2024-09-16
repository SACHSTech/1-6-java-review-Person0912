package gr11review.part1;
import java.io.*;

public class Review5 {
    public static void main(String[] args) throws IOException {
       
        double dblInvYear;
        double dblIntRate;
        double dblTarg;
        double dblTotal = 0;
        int intTime = 0;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the yearly invested amount: ");
        dblInvYear = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblIntRate = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the target amount: ");
        dblTarg = Double.parseDouble(keyboard.readLine());

        while (dblTarg > dblTotal) {
            dblTotal = (dblTotal + dblInvYear) * (1 + dblIntRate/100);
            intTime ++;
        }

        System.out.println("The target amount will be earned in " + intTime + " years.");

    }
}