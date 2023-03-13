package Day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String car = "Lexus-IS-F";
        //there are 2 types of split
        String[] carSplit = car.split("-",2);
        System.out.println(Arrays.toString(carSplit));
        System.out.println(car);

        String model = carSplit[1];
        System.out.println(model);















    }
}
