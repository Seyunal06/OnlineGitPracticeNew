package Day64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapKeySetView {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        //what do you think the data type will be to store such collection?
        //-- Set because keys are unique

        //we can use KeySet() method of Map to get Set of Keys
        //this Set is strictly connected to the original map
        //if you remove an item, Map entry with this key will also be removed
        Set<String> allNames = groceryPrice.keySet();
        System.out.println("allNames = " + allNames);

       // allNames.remove("Tomato");
        System.out.println("allNames = " + allNames);
        System.out.println("groceryPrice = " + groceryPrice);
        //WHAT IF WE DON'T WANT SUCH A RELATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE?
          //GET A COPY OF THE SET INTO A DIFFERENT OBJECT
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPrice = " + groceryPrice);




    }
}
