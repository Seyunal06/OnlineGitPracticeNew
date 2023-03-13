package Day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {

        String name1 ="Seyma";
        String name2 ="Marcos";

        //the two names should switch places

        String tempContainer =name1;//seyma
        name1 = name2; //name1--> marcos
        name2 = tempContainer; // name2--> seyma

        System.out.println("name1 " + name1);
        System.out.println("name1 " + name2);

        //swapping the first and last value
        int[] myNumbers = new int[]{10,40,30,7};

        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;

        System.out.println("first value " + myNumbers[0]);
        System.out.println("last value " + myNumbers[3]);


        System.out.println(Arrays.toString(myNumbers));
    }
}
