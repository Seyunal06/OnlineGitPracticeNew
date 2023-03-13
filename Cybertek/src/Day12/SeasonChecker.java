package Day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please ");
        String season = scan.next();

        if(season.equalsIgnoreCase("spring")){
            System.out.println("New flowers");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("Swimming pool");
        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("Leaves");
        }else if(season.equalsIgnoreCase("winter")){
            System.out.println("Snow");
        }else{
            System.out.println("Invalid!");
        }
    }
}
