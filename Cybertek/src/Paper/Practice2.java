package Paper;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {


        Random rn = new Random();
        final int MAX = 99;
        int num1 = rn.nextInt(MAX) - 0;
        int num2 = rn.nextInt(MAX) - 0;
        int total = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        int ans = num1 - num2 ;
        determineResult(total, ans);

            if (ans == total) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Sorry, wrong answer!");
                System.out.print("answer is ");
                System.out.print(num1 - num2);
            }
        }
        public static void determineResult(int result, int input){
            Scanner scan = new Scanner(System.in);
            Random rn = new Random();
            int one =0, two=0;
            one = rn.nextInt(99) - 0;
            two = rn.nextInt(99) - 0;
            result = (one > two) ? (one - two) : (two - one);
            do {
                System.out.printf("What is your answer to %d - %d = ?%n",
                        (one > two) ? one : two, (one > two) ? two : one);
                input = scan.nextInt();
            }while (input < 0 || input > 99) ;
        }
    }
