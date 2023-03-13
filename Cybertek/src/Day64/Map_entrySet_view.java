package Day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        //Map is not iterable
        //in order to iterate over map,  we need to get something iterable like set
        //Map stores key value pair as Entry internally
        //and we can get these entries out using entrySet() view
        //so we can perform operation on key value pair together
        Set<Map.Entry<String, Double>>entryView = groceryPrice.entrySet();

        for (Map.Entry<String, Double> each:entryView ){
            System.out.println("Key for current entry is "+each.getKey());
            System.out.println("Value for current entry is "+each.getValue());
            //update the value that has 5 char to $15

            if (each.getKey().length()==5){
                each.setValue(15.);
            }
        }
        System.out.println(groceryPrice);
    }
}
