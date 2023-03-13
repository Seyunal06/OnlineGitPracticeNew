package Day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String name = "Seyma";

        char[] allCharInName = name.toCharArray();

        for(char eachChar: allCharInName){
            System.out.println(eachChar);
        }

        //counting how many a's
        int count = 0;
        for (char eachChar :allCharInName) {
            if (eachChar == 'a'){
                ++count;
            }

        }
        System.out.println(count);


        Arrays.sort(allCharInName);
        System.out.println(Arrays.toString(allCharInName));
    }
}
