package Day06;

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert");

        int minutes = scan.nextInt();
        int hourPart = minutes/60;
        int minPart = minutes%60;

        System.out.println(minutes + " minutes is " + hourPart + " hours and " + minPart + " minutes");

    }
}
