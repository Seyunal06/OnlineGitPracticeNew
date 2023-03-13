package Paper;

import java.text.DecimalFormat;
import java.util.Scanner;

public class poopExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num, power, total;
        String repeat = "YES";
        while (repeat.equalsIgnoreCase("yes")) {
            do {
                System.out.println("Enter the base of a number --> ");
                num = scan.nextDouble();
            } while (num <= 0);
            do {
                System.out.println("Enter the power to raise the base --> ");
                power = scan.nextDouble();
            } while (power <= 0);

            double dblResult = Math.pow(num, power);
            System.out.printf(num + " raised to the power of " + power + " is  %,.4f" , + dblResult);
            System.out.print("\nEnter YES to repeat: --> ");
            repeat = scan.next();
        }
    }
}
