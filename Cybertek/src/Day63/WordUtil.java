package Day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {
    public static void main(String[] args) {


        String str = "fun fun fun Java Java is ending tomorrow tomorrow no it is never ending";

        //printing it out directly
        System.out.println(getFreqMap(str));


//        for (String word : str.split("")) {
//            System.out.println(word);
//        }

    }

    //this is static so we can directly call it in the main
    public static Map<String, Integer> getFreqMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
        String[] allWords = str.split(" ");

        for (String word : allWords) {
            if (!wordFreqMap.containsKey(word)){
                wordFreqMap.put(word,1);
            }else{
                //if we come to this point it means you already have the key and value
                wordFreqMap.replace(word, wordFreqMap.get(word)+1);
            }
        }
        return wordFreqMap;

    }
}

