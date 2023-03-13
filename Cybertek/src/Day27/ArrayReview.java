package Day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
        System.out.println("Enter a number: ");
        //int input = scan.nextInt();
        numbers[i] = scan.nextInt();
    }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int large = numbers[numbers.length-1];
        int small = numbers[0];
        System.out.println("Largest number is: " + large);
        System.out.println("Smallest number is: " + small);


    }
}
