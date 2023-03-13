package BootCamp.Day1;

public class SumTheDigits {
    public static void main(String[] args) {

        int num = 6;

        int thirdDigit = num / 100;
        int nextNum = num % 100;
        int secondDigit = nextNum /10;
        nextNum = nextNum % 10;
        int firstDigit = nextNum /1;
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println(sum);



    }
}
