package Day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The start");
        String name = "Seyma";

        Scanner scan = new Scanner(System.in);
        System.out.println("get certain char from my name");
        int targetIndex = scan.nextInt();

        try{
        System.out.println(name.charAt(targetIndex));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Message from getMessage method "+e.getMessage());
            System.out.println("something unusual happened");
        }catch (InputMismatchException bla){
            System.out.println("input mismatch, enter number");
        }

        System.out.println("the end");

//        StringIndexOutOfBoundsException e1 =new StringIndexOutOfBoundsException();
//        System.out.println(e1.toString());

    }

}
