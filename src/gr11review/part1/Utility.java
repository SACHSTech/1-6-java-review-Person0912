package gr11review.part1;

/**
 * A program Utility.java that consists of two methods for the assignment
 * 
 * @author: Kayla Jin
 */

public class Utility {
    
    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws Exception If there is an error
     */
    public static void main(String[] args) throws Exception {
        
        // Tests the zipZap method
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
        System.out.println(zipZap("zzzuzoz"));

        // Tests the sumStrNum method
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

    }

    /**
     * A method that checks for patterns of length 3 starting with 'z' and ending with
     * 'p' and removes the middle character.
     * 
     * @param str The string to be altered
     * @return The altered string with the removed middle characters
     */
    public static String zipZap(String str) {
        
        // String to store the altered string
        String strNewZp = "";

        // Loop to remove the middle characters between 'z' and 'p' in the string and add them to the new string
        for (int i = 0; i < str.length(); i++) {
            
            strNewZp += str.charAt(i);
            
            if (str.charAt(i) == 'z' && i + 2 < str.length() && str.charAt(i + 2) == 'p') {
                i++;
            }
        }

        // Return the altered string
        return strNewZp;
    }

    /**
     * A method that sums the numbers that appear in the string
     * 
     * @param str2 The string consisting of numbers
     * @return The sum of the numbers that appear in the string
     */
    public static int sumNumbers(String str2) {

        // Variable to temporarily store sequences of numbers
        String strTempNum = "";

        // Stores the sum of the numbers in the string
        int intSum = 0;

        // Adds the numbers in str2 temporarily to strTempNum and then adds the full number to the sum
        for (int j = 0; j < str2.length(); j++) {
            
            if (Character.isDigit(str2.charAt(j))) {
            
                strTempNum += str2.charAt(j);

            }
            else if (!strTempNum.equals("")) {
                
                intSum += Integer.parseInt(strTempNum);
                strTempNum = "";
            }
        }

        // Ensures any number at the end of the string will be added
        if (!strTempNum.equals("")) {

            intSum += Integer.parseInt(strTempNum);
        }
        
        // Returns the sum
        return intSum;
    }
}

