package Paper;

import java.util.Scanner;

public class poop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = "";
        int num = 1;
        String bar ="";

        System.out.print("Enter any text -> ");
        text = scan.nextLine();

        System.out.print("How many lines to display? ");
        num = scan.nextInt();
        while(num < 1 || num > 10){
            System.out.print("How many lines to display? ");
            num = scan.nextInt();

        }
        for (int i = 0; i < num; i++) {
            if(num % 2 ==0){
                System.out.println(text + " **");
            }else{
                System.out.println(text + " *");
            }

        }
    }
}
