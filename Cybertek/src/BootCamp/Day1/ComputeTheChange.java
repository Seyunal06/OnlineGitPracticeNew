package BootCamp.Day1;

public class ComputeTheChange {
    public static void main(String[] args) {

        double amount = 11.56;

        //two types of casting, explicit(manually), implicit(automatically)
        int numInCents= (int)(11.56 * 100);
        int dollars = numInCents/100;//gives dollar amount
        numInCents = numInCents %100;//this will return last two digits
        int quarters = numInCents/25;//gives me the quarter amount
        numInCents= numInCents % 25;//returns the amount less than 25 cents
        int dimes = numInCents / 10;//gives me the dimes
        numInCents = numInCents % 10;//returns the amount less than 10 cents
        int nickel = numInCents / 5;// gives me the nickels
        int pennies = numInCents % 5;//gives me the penny

        System.out.println("dollars = " + dollars+" \nquarters = " + quarters+
                " \ndimes = " + dimes+" \nnickel = " + nickel+" \npennies = " + pennies);

        System.out.println("=============================");

        //integer overflow, underflow
        int num1 = 2147483647;
        int num2 = -2147483647;

        //when you give more value than it can take
        //overflow
        System.out.println(num1 + 2);
        //underflow
        System.out.println(num2 - 2);

    }
}
