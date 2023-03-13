package Day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name ="Seyma";

        char[] namesChars = new char[name.length()];

//        namesChars[0] = name.charAt(0);
//        namesChars[1] = name.charAt(1);

        //using for loop to fill up the array one by one
        for (int x = 0; x < namesChars.length; x++) {
           // System.out.println(name.charAt(x));
            namesChars[x] = name.charAt(x);
        }

        //System.out.println(namesChars);
        System.out.println(Arrays.toString(namesChars));

        //THIS IS THE SHORTCUT WAY
        char[] namesChars2 = name.toCharArray();
        System.out.println(Arrays.toString(namesChars2));

    }
}
