package Day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {


        String str = "fun fun fun Java is ending tomorrow tomorrow no it is never ending";

        String[] allWords = str.split(" ");
        System.out.println("The words length is "+allWords.length);

        Map<String, Integer> wordFreqMap =new HashMap<>();

        for (String currentWord : allWords) {
            if (wordFreqMap.containsKey(currentWord)==false){
                wordFreqMap.put(currentWord,1);
            }else{
                wordFreqMap.replace(currentWord, wordFreqMap.get(currentWord)+1);
        }
    }
        System.out.println(wordFreqMap);
    }
}
