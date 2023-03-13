package Paper;

import java.text.DecimalFormat;
import java.util.Scanner;

public class poop3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int item;
        double price, tax, total;
        final double taxRate= 0.06;
        String repeat = "YES";
        DecimalFormat df = new DecimalFormat("0.00");

        while(repeat.equalsIgnoreCase("yes")) {
           do {
               System.out.println("Enter the price of an item -> ");
               price = scan.nextDouble();
           }while (price <= 0);

            tax = price * taxRate;
            total = price + tax;

            System.out.println("The price of the item is $" + price);
            System.out.println("The tax is $" + df.format(tax));
            System.out.println("The total is $" + df.format(total));
            System.out.print("\nEnter YES to repeat: --> ");
                repeat = scan.next();
        }
    }
}
