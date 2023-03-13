package Day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class FindingUniqueV2 {
    public static void main(String[] args) {

        String str = "The new link for joining the class will require you to login to Okta, if it asks you to sign in" +
                "please just click on it.";

       // Set<Character> chars = new HashSet<>(Arrays.asList('A','A','A','A','A'));
        //      Set<Character> chars = new HashSet<>(Arrays.asList(new Character[]{'A','A','A','A','A'}));
//        System.out.println(chars);

        String[] eachCharStrArray = str.split("");
        System.out.println(Arrays.toString(eachCharStrArray));

        //then turn it into a List with Arrays.AsList
        List<String> charLst = Arrays.asList(eachCharStrArray);

        //eventually create a HashSet object by copying everything inside this list=
        Set<String> charSet = new HashSet<>(charLst);
        System.out.println(charSet);

        //ONE SHOT WAY OF DOING THIS
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("THE ONE SHOT WAY "+charSetShortWay);






    }
}
