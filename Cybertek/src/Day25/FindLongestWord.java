package Day25;

import java.util.Arrays;

public class FindLongestWord {
    public static void main(String[] args) {

        String sentence = "Flowers are very pretty and im happy!";

        String[] allWords = sentence.split(" ");
        System.out.println(Arrays.toString(allWords));

        //IT CAN ALSO BE USED LIKE THIS
        //String longestWord = allWords[0];
        String longestWord = "";
        //you would also be able to delete maxCharCount
        int maxCharCount = 0;

        for (String currentWord :allWords) {
            System.out.println(currentWord);
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;

            }
        }
        System.out.println("The result --> " + longestWord);

    }
}
