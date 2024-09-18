package gr11review.part1;
import java.io.*;

/**
 * A program Review7.java that takes a sentence from the user and outputs
 * the number of characters, the number of spaces, and the number of letter a's
 * in the sentence. Finally, the number of odd number characters in the sentence
 * are outputted as a string of hyphens.
 * 
 * @author: Kayla Jin
 */

public class Review7 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        
        // Keyboard object to read user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        /* Variables to count the number of spaces, number of a's, and to store the string
         * of hyphens for the odd numbered characters
         */
        int intSpaceCount = 0;
        int intACount = 0;
        String strOdd = "";

        // Takes a sentence from the user
        String strSentence = keyboard.readLine();

        /* For loop to check the number of spaces, letter a's, and add the odd numbered characters to
         * a string of hyphens.
         */
        for (int i = 0; i < strSentence.length(); i++) {
            
            // Checks the number of spaces
            if (strSentence.charAt(i) == ' ') {
                intSpaceCount ++;
            }
            
            // Checks the number of a's
            if (strSentence.charAt(i) == 'a') {
                intACount ++;
            }

            // Checks the odd numbered characters
            if (i % 2 == 0) {
                strOdd += "-";
            }
        }

        // Prints out the results
        System.out.println("There are " + strSentence.length() + " characters in the sentence.");
        System.out.println("There are " + intSpaceCount + " spaces in the sentence.");
        System.out.println("There are " + intACount + " letter a in the sentence.");
        System.out.println(strOdd);

    }
}