package Paper;

import java.util.Scanner;

public class poop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = "";
        int num = 1;
        int until = 10;
        System.out.print("Enter any text -> ");
        text = scan.nextLine();

            do {
                System.out.print(" How many lines to display? ");
            num = scan.nextInt();
            num++;
            System.out.println(text);
            }while (num <= until);
    }
}
