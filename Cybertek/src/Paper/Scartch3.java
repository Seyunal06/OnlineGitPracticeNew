package Paper;

import java.util.Scanner;

public class Scartch3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;


        do {
            System.out.println("enter num or -99 to quit");
            num = scan.nextInt();

        }while (num != -99);

    }
}
