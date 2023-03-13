package Day29;

import java.util.Arrays;

public class FillingUpArray {
    public static void main(String[] args) {


        int[] numbers = new int[100];

        for (int x = 0; x< numbers.length;x++){
            numbers[x] = x+1;
            //for even
            //numbers[x] = x+2;
        }
        System.out.println(Arrays.toString(numbers));

        String[] words = new String[300];
        //null means no object
        //when you dont put anything for String in this case



        for (int x = 0; x< words.length;x++){
            words[x] = "I love Java";

        }
        System.out.println(Arrays.toString(words));

    }
}
