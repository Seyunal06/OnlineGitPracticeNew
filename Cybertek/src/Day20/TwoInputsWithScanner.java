package Day20;

import java.util.Scanner;

public class TwoInputsWithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("Your speed starts here -->");
        for(int i = start; i<= end; i++){
            System.out.println(i + ", ");
        }
    }
}
