package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static <ArraysList> void main(String[] args) {

        //Create list of 6 double in short way
        //we will just read them and will not add or remove item
        List<Double> prices= Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);
        //prices.add(12.8); WE CANNOT ADD OR REMOVE
        System.out.println("Old prices--> "+ prices);

        int count =0;
        for (Double each :prices) {
            if (each>5){
                ++count;
            }
        }
        System.out.println("count--> "+count);

        //I want to add 2 more prices(does not have to be same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("New prices--> "+ newPrices);

        //Create a ArrayList Object in one shot with many items so we can add or remove
        System.out.println("-------------------------------------");
        //one way to create ArrayList Object in one shot
        ArrayList<Double> oneShotPrice
                = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));
        System.out.println("before--> "+oneShotPrice);
        //Add 100.99 after 9.99
        oneShotPrice.add(1,100.99);
        //Remove item 3
        oneShotPrice.remove(2);
        System.out.println("after--> "+oneShotPrice);





    }
}
