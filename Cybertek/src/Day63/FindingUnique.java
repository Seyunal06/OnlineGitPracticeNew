package Day63;

import java.util.HashSet;
import java.util.*;

public class FindingUnique {
    public static void main(String[] args) {

        String str = "The new link for joining the class will require you to login to Okta, if it asks you to sign in" +
                "please just click on it.";

        // How many unique char showed up in the sentence above
        //looking for the chars that don't duplicate

        Set<Character> charSet = new HashSet<>();
        for (int x = 0; x< str.length(); x++) {
            charSet.add(str.charAt(x));
        }
        System.out.println("How many character overall "+str.length());
        System.out.println("How many unique characters "+charSet.size());
        System.out.println(charSet);

        for (Character eachChar: charSet) {
            System.out.println("non-repeating chars " +eachChar);
        }



    }
}
