package Day17;

import java.util.Scanner;

public class NameFixScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Full name? ");
        String fullName = scan.nextLine();
        int indexOfSpace = fullName.indexOf(" ");

        String firstN = fullName.substring(0, indexOfSpace);
        String lastN = fullName.substring(indexOfSpace + 1);

        String firstFix = firstN.toUpperCase().substring(0,1) +
                firstN.toLowerCase().substring(1);

        System.out.println(firstFix);
        String lastFix = lastN.toUpperCase().substring(0,1)+
                lastN.toLowerCase().substring(1);
        System.out.println(lastFix);

        fullName = firstFix + " " + lastFix;
        System.out.println(fullName);
    }
}
