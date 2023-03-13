package Paper;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Scratch2 {
    public static void countAndDisplay(String text, char searchChar)
    {
        int num = 0; // reset the count

        // Count the number of times the letter appears
        // in the string using a loop.
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == searchChar) {
                num++;
            }
        }
        // Format and display the count.
        System.out.printf("\nThe letter %s appears %d times in "
                + "the string: %s\n", searchChar, num, text);
    }

    /**
     * This method prompts user for input and validates input. String
     * does not hold null
     * @param read Scanner object needed for input
     * @return a valid String data
     */
    public static String getInputText(Scanner read)
    {
        String text;
        do{
            System.out.print("Enter some text: --> ");
            text = read.nextLine();
        }while(text.length() == 0);
        return text.toUpperCase();
    }

    /**
     * This method returns a single character where called
     * @param read scanner class object needed for prompting
     * @return a single character in uppercase
     */
    public static char getInputChar(Scanner read)
    {
        char myChar;
        String temp;
        do{
            System.out.print("Enter a letter contained in the text: --> ");
            temp = read.nextLine();
        }while(temp.length() == 0);
        myChar = temp.charAt(0);
        myChar = Character.toUpperCase(myChar);
        return myChar;
    }

    public static void main(String[] args)
    {
        String input;     // To hold keyboard input
        String str;       // The string to search
        String strUpper;  // Uppercase equivalent of str
        char letter;      // The letter to count
        int num;          // Number of times the letter appears
        String repeat = "yes"; // repeat program
        Scanner scan = new Scanner(System.in);

        while (repeat.equalsIgnoreCase("YES"))
        {
            // Get a string from the user.

            str = getInputText(scan); // call or invoke method
            // Get the uppercase equivalent of the string.


            // Get the letter to count.

            letter = getInputChar(scan);
            countAndDisplay(str, letter); // call method

            System.out.print("Enter \"yes\" to repeat: --> ");
            repeat = scan.nextLine();
        }
    }
}
