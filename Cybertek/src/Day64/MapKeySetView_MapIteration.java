package Day64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

       //Map is not iterable so we can not directly iterate over them
        //we can get something iterable out of the map
        //for example keySet view will return a Set<String> and its iterable

        Set<String> allNames = groceryPrice.keySet();

        for (String eachName: allNames){
            System.out.println(eachName);
            System.out.println("The price " + groceryPrice.get(eachName));
        }






    }
}
