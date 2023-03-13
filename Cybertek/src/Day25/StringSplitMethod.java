package Day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {

        String sentence = "I love Java";

        //sentence.split(" ");

        String[] allWords = sentence.split(" ");

        System.out.println("all the words  = " + Arrays.toString(allWords));

        System.out.println("how many word(s) do I have in this sentence? --> " + allWords.length);

        System.out.println("last word in the sentence is --> " +allWords[allWords.length-1] );

        String sentence2 = "Everything is Awesome!!!";
        //split by letter e

        //String[] splitByEArray = sentence2.split("e")
        allWords = sentence2.split("e");

        System.out.println(Arrays.toString(allWords));

        //each piece separately
        for(String eachPieces : allWords){
            System.out.println(eachPieces);
        }

    }
}
