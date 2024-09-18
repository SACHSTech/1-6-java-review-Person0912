package gr11review.part1;
import java.util.Random;

/**
 * A program Review8.java that simulates 1000 pulls of a slot machine
 * consisting of numbers between 0 and 8. The total count of the number of triples
 * is then outputted.
 * 
 * @author: Kayla Jin
 */

public class Review8 {
    
    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws Exception If there is an error
     */
    public static void main(String[] args) throws Exception {
        
        // Random object to generate random numbers
        Random randNum = new Random();
        
        // Variable to count the number of triples
        int intNumTriples = 0;

        // Variables to temporarily store the three numbers in each row
        int intNum1;
        int intNum2;
        int intNum3;

        // Prints the output of the slot machine
        for (int i = 0; i < 1000; i++) {

            // Sets the three numbers in each row as random numbers between 0 and 8
            intNum1 = randNum.nextInt(9);
            intNum2 = randNum.nextInt(9);
            intNum3 = randNum.nextInt(9);

            // Prints the three random numbers
            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);

            // Checks for a triple in each row
            if (intNum1 == intNum2 && intNum2 == intNum3) {
                intNumTriples++;
            }
            
        }

        // Print the number of triples
        System.out.print(intNumTriples);
    }
}