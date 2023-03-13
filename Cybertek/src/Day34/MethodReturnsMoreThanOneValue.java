package Day34;

import java.util.Arrays;

public class MethodReturnsMoreThanOneValue {
    public static void main(String[] args) {

        String sentence = "I love Java";

        char[] eachChar = sentence.toCharArray();
        String[] eachWord = sentence.split(" ");

        int[] resultArr = returnResult();
        System.out.println(Arrays.toString(resultArr));


    }
    public static int[] returnResult(){

        int[] count = {56,52};
        return count;
    }


}
