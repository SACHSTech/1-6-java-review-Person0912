package gr11review.part1;
import java.io.*;

public class Review7 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        String strSentence = keyboard.readLine();
        int intSpaceCount = 0;
        int intACount = 0;
        String strOdd = "";

        for (int i = 0; i < strSentence.length(); i++) {
            
            if (strSentence.charAt(i) == ' ') {
                intSpaceCount ++;
            }
            if (strSentence.charAt(i) == 'a') {
                intACount ++;
            }
            if (i % 2 == 0) {
                strOdd += "-";
            }
        }

        System.out.println("There are " + strSentence.length() + " characters in the sentence.");
        System.out.println("There are " + intSpaceCount + " spaces in the sentence.");
        System.out.println("There are " + intACount + " letter a in the sentence.");
        System.out.println(strOdd);

    }
}