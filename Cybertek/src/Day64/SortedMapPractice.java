package Day64;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice {
    public static void main(String[] args) {

        //SortedMap extends Map and it will keep the sorted order
        //TreeMap is the implementation class

        //sort by natural order of the key data type
        SortedMap<String, Double> groceryPrice = new TreeMap<>();

        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        System.out.println(groceryPrice);

        //IQ:
        // Difference between HashMap, LinkedHashMap, TreeMap
            //HashMap default implementation : faster, no insertion order, no sorted order
            //LinkedHashMap extends HashMap : slightly slower, keep inserted order, no sorted order
            //TreeMap: SortedMap implementation : slowest, no insertion order, has sorted order

        // Difference between HashMap and HashSet
        //-->HashSet is implementation of Set interface
            //it stores unique elements per item
        // -->HashMap is implementation of Map interface
            //it stores key value pair --keys are unique
        //TWO COMPLETELY DIFFERENT DATA STRUCTURE





    }
}
