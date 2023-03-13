package Day27;

public class ArrayReviewContinue {
    public static void main(String[] args) {

        //DO NOT USE SORT

        int[] scores = {100, 897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};

        int small = 999999999;
        int large = -999999999;

        for (int i = 0; i < scores.length; i++) {
            if (small > scores[i]){
                small = scores[i];
            }
            if (large < scores[i]){
                large = scores[i];
            }
        }
        System.out.println("smallest number: " + small);
        System.out.println("Largest number: " + large);

        int secondSmall = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == small){
                continue;
            }
            if (secondSmall > scores[i]){
                secondSmall = scores[i];
            }
        }
        System.out.println("the second smallest number: " + secondSmall);





    }
}
