package Day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str ="AAABBBBBBACCRDDD";

        //Store it into Map<char,int>
        Map<Character,Integer> charFreq = new HashMap<>();

        for (int x = 0; x < str.length(); x++) {
            char currentChar =str.charAt(x);

            if (!charFreq.containsKey(currentChar)){
                System.out.println("Enter for the first time "+currentChar);
                charFreq.put(currentChar,1);
            }else{
                //if we come to this point it means we already have the char
                //so we update the count with 1 extra than existing count
                charFreq.replace(currentChar, charFreq.get(currentChar)+1);
            }
        }
        System.out.println(charFreq);



    }
}
