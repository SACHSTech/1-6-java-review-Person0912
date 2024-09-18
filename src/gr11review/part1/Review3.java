package gr11review.part1;

/**
 * A program Review3.java that prints the odd numbers from 20 to 100
 * and the numbers from 29 to 2 in decreasing order.
 * 
 * @author: Kayla Jin
 */

public class Review3 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws Exception If there is an error
     */
    public static void main(String[] args) throws Exception {

        // Outputs the odd numbers from 20 to 100
        for (int i = 21; i <= 99; i += 2) {
            System.out.println(i);
        }

        System.out.println("");

        // Outputs the numbers from 29 to 2
        for (int j = 29; j >= 2; j--) {
            System.out.println(j);
        }
    }
}