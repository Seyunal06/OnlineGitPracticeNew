package Day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int[] scores1 ={2,5,6,7,3,34,6};

        int[] scores2 ={22,45,6,37,3,6,9};

        int[] scores3 ={2,5,6,7,3,34,6};

        System.out.println(scores1 == scores2);

        System.out.println(scores1 == scores3);

        System.out.println("After doing it the right way ------");

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println(isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println(isS1S3Equals);

    }
}
