package Day63;

import java.util.*;

public class MapGroceryItems {
    public static void main(String[] args) {

        Map<String,Double> grocery = new HashMap<>();

        grocery.put("Apple",.50);
        grocery.put("Apple",.50);
        grocery.put("Banana",.75);
        grocery.put("Grapes",.70);
        grocery.put("Tomato",.60);

        grocery.putIfAbsent("Orange",.64);

        System.out.println(grocery);
        System.out.println("Getting the value for the 3rd item: "+grocery.get("Banana"));

        //Double price
        System.out.println(grocery.get("Apple")*2);
        //grocery.replace("Apple",1.00);
        grocery.replace("Tomato",1.10);

        System.out.println("The amount of items on my list: "+grocery.size());

        System.out.println(grocery);

    }
}
