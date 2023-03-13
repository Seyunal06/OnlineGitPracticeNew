package Day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        System.out.println("Original first item " + scores[0]);

        //Ascending order
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("first item " + scores[0]);

        char[] nameChars = {'G','A','D','Z','C','A'};

        System.out.println(Arrays.toString(nameChars));

        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));

        String[] superHeros ={"Superman", "Batman", "Wonder Women", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println(Arrays.toString(superHeros));

        //sort method does not work for boolean
        boolean[] fiveSwitchOnOff = {true, false, false, true, true};
        System.out.println(Arrays.toString(fiveSwitchOnOff));
        //Arrays.sort(fiveSwitchOnOff);

    }
}
