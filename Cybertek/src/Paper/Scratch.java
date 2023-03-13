package Paper;

import java.util.Scanner;

public class Scratch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        //user input
        int userInput = 0;
        //user answer
        String userAnswer;
        boolean repeatProgramFlow = false;

        //determine the user iput and display it on screen
        determineAndDisplay(scanner, userInput);

        //promt user if he want to enter more number
        System.out.println("Enter 'Yes' to repeat:");
        userAnswer = scanner1.nextLine();

        if(userAnswer.equalsIgnoreCase("yes")) {
            repeatProgramFlow = true;
        }
        else {
            repeatProgramFlow = false;
        }

        while(repeatProgramFlow == true) {
            determineAndDisplay(scanner, userInput);
            //prompt user to enter yes if user want to add more numbers
            System.out.println("Enter 'Yes' to repeat:");
            userAnswer = scanner1.nextLine();
            if(userAnswer.equalsIgnoreCase("yes")) {
                repeatProgramFlow = true;
            }
            else {
                repeatProgramFlow = false;
            }
        }

    }

    //method display user to enter the input and determine the user input
    public static void determineAndDisplay(Scanner scan, int userIn) {
        int smallestInteger = Integer.MAX_VALUE;
        int largestInteger = Integer.MIN_VALUE;

        //prompt user to enter integer also enter -99 to stop entering
        System.out.println("Enter an integer, or -99 to quit: ");
        userIn = scan.nextInt();

        if (userIn == -99) {
            //prompt user if user do not enter any number
            System.out.println("You did not enter any numbers!");

        }

        else {
            while (userIn != -99) {
                if (userIn >= largestInteger) {
                    largestInteger = userIn;
                }
                if (userIn <= smallestInteger) {
                    smallestInteger = userIn;
                }

                System.out.println("Enter an integer, or -99 to quit: ");
                userIn = scan.nextInt();
            }

            //print smallest integer enter by user
            System.out.println("Smallest integer entered: " + smallestInteger);
            //print largest integer enter by user
            System.out.println("Largest integer entered: " + largestInteger);

        }
    }


    }

