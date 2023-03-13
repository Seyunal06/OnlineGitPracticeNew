package Day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double regularPrice = 80;
        double salePrice = 64;
        double discount = 0.2;

        System.out.println("What is the regular price? ");
        regularPrice = scan.nextDouble();
        System.out.println("What is the discount rate? ");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;
        System.out.println("regular price is $" + regularPrice +
                ", discount is " + discount + " and your deal is $" + salePrice);



    }
}
