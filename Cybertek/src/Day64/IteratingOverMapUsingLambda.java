package Day64;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMapUsingLambda {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        //Optional
        groceryPrice.forEach((name,price)-> System.out.println(name+" "+price));


    }
}
