package Shorts;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//
//        int apples = 4 ;
//        while (apples <= 10){
//            System.out.println("Eating an apple " + apples);
//            apples++; //this is to track how many is executed
//                      // so that it wont print out infinite amount
//        }
//        System.out.println("No more apples");//this is like the else part
//
        int number, count;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();

        count = 1;
        while (count <= number){
            System.out.print(count + ", ");
            count++;
        }

//        Scanner scan = new Scanner(System.in);
//        int total = 0;
//        System.out.println("Enter a positive integer: ");
//        int nextNum= scan.nextInt();
//
//        while (nextNum > 0){
//            total = total + nextNum;
//            nextNum = scan.nextInt();
//        }
//        System.out.println("Sum of all numbers: " + total);
    }
}
