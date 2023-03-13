package Day64;
import java.util.*;

public class Map_valuesView {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        //in order to get all the values in the map and store it into a collection
        //we can use values method from the map and it will return
        //a Collection object that contains all the value

        Collection<Double> allPrices = groceryPrice.values();
        System.out.println(allPrices);
        //first come first serve -- first occurrence will be removed
        allPrices.remove(1.99);
        System.out.println(groceryPrice);

        //if you don't want a connection you may copy allPrices into different collection object
        List<Double> pricesCopy = new ArrayList<>(allPrices);



    }
}
