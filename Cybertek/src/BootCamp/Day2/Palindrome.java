package BootCamp.Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String or a number to check the palindrome");
        String str = input.next();

        //999
        int low = 0;
        int high = str.length()-1;

        Boolean isPalindrome =true;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(low) !=str.charAt(high)){
                isPalindrome =false;
                break;
            }
            low++;
            high--;
        }
        System.out.println("is it a palindrome " + isPalindrome);




    }
}
