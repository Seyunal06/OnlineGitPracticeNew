package Day30;

import java.util.Arrays;

public class SplitAndDefineSize {
    public static void main(String[] args) {

        String sentence = "I love Java Java Java";
       // String[] wordsArray= sentence.split(" ");
        //String[] wordsArray= sentence.split(" ",2);
        String[] wordsArray= sentence.split(" ",4);

        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);






















    }
}
