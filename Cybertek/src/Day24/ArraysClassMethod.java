package Day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        //Arrays class a class coming from java.util package
        //it has a lot of pre-built method to work with array object

        //for printing the content of the array
        //toString --->Arrays.toString(yourArrayHere)

        String[] superHeros ={"Superman", "Batman", "Wonder Women", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));

        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(superHerosAsString);

        //how do we get the first character of SuperHerosAsString variable
        System.out.println(superHerosAsString.charAt(0));

        int[] nums = {10,44,55,3,78};
        System.out.println(Arrays.toString(nums));

        double[] prices = {3.14, 5.5, 9.0};
        System.out.println(Arrays.toString(prices));
        String pricesString = Arrays.toString(prices);
        System.out.println(pricesString);

        for (int x = 0; x < pricesString.length(); x++) {
            System.out.println("character at index " + x + " is " + pricesString.charAt(x));
        }
        // the purpose Arrays.toString(yourArray) to see whats inside


        //for sorting an array in ascending order
        //sort --->Arrays.sort(yourArrayHere)

        //for checking for equality of 2 array object content
        //equals --->Arrays.equals(firstArray, secondArray)

    }
}
