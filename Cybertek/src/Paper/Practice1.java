package Paper;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int highest;
        int lowest;

        System.out.print("Enter your lowest integer 1st --> ");
        lowest = scan.nextInt();

        System.out.print("Enter the highest integer 2nd --> ");
        highest = scan.nextInt();

        for (int x = lowest; lowest> highest; x++){
            System.out.print("Enter your lowest integer 1st --> ");
            lowest = scan.nextInt();
            System.out.print("Enter the highest integer 2nd --> ");
            highest = scan.nextInt();
        }
        calculateSum(lowest, highest);
    }
    public static int calculateSum(int low, int high){
        Scanner scan2 = new Scanner(System.in);
        int sum = 0;
        String repeat = "YES";

            for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
            while(repeat.equalsIgnoreCase("yes")){
        System.out.print("Enter \"YES\" to repeat: --> ");
        repeat = scan2.next();
    }
        return sum;
    }
}
