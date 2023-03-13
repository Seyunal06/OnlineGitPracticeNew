package Day26;

import java.util.Arrays;

public class ToCharArray2 {
    public static void main(String[] args) {


        String survey = "Complete B15 online 1 month Survey";
        char[] surveyChars = survey.toCharArray();
        System.out.println("before sorting " +Arrays.toString(surveyChars) );


        Arrays.sort(surveyChars);
        System.out.println(Arrays.toString(surveyChars));
    }
}
