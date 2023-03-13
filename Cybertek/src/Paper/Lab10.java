package Paper;

import java.util.Random;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // declaring variables
        int num1, num2, input = 0, wins = 0, percent = 0;
        String repeat = "YES";
        // creating object of Random() class
        Random rn = new Random();
        // using while loop
        while (repeat.equalsIgnoreCase("yes")) {
            // generating first ransom number
            num1 = rn.nextInt(99) + 1;
            // generating second random number
            num2 = rn.nextInt(99) + 1;
            int inputNumber=getValidGuess(scan);//call method to get valid guess
            percent += 1;
            //display random numbers
            System.out.println("The 2 random numbers are " + num1 + " and " + num2);
            //call method to check num
            if (displayGuessResults(num1, num2, inputNumber)) {
                //display result
                System.out.println("GOOD GUESSSSSSSSSSSSSSSSSSSSSSSSS!");
                //increment wins
                wins++;

            } else if (displayGuessResults(num1, num2, inputNumber)) {
                //display result
                System.out.println("GOOD GUESSSSSSSSSSSSSSSSSSSSSSSSS!");

                wins++;

            } else {
                //display message
                System.out.println("Outside Range");

            }
            //asking user whether want to repeat
            System.out.println("say yes to repeat -->");
            //reading input
            repeat = scan.next();
        }
        //display number of guess
        System.out.printf("There are %d guess(es) in the range ", wins);
        //display guess percent
        System.out.printf("\nCorrect guesses percentage is %.2f%1c",

                wins * 100.0 / percent, '%');

    }

    //method to get the valid guess
    public static int getValidGuess(Scanner get) {
        int input;// declaring variable
        // using do while loop
        do {
            System.out.println("Guess a number: ");
            input = get.nextInt(); // reading guess
        } while (input <= 1 && input >= 99);
        return input;// when valid number is entered return input
    }

    //method to display guess result
    public static boolean displayGuessResults(int start, int end, int num) {
        // checking number is between start and end
        if (num >= start && num <= end) {
            return true;// return true
        } else {
            return false;// return false
        }
    }
}