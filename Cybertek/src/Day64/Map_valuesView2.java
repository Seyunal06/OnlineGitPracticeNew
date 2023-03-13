package Day64;
import java.util.*;

public class Map_valuesView2 {
    public static void main(String[] args) {

        Map<String, Double> groceryPrice = new HashMap<>();
        groceryPrice.put("Tomato",1.99);
        groceryPrice.put("Potato",2.99);
        groceryPrice.put("Grapes",3.99);
        groceryPrice.put("Banana",1.99);
        groceryPrice.put("Apple",1.89);

        System.out.println(groceryPrice);
        Collection<Double> allPrices = groceryPrice.values();

        //remove all entry of the grocery if the price value is more than 3

        //EASY AND SHORT WAY
//        allPrices.removeIf(eachPrice -> eachPrice>3);
//        System.out.println(groceryPrice);


        //The logic is to use the strict connection between the view and the original map
        //iterate over the allPrices and check the condition for more than 3 or not
        //remove if it is more than 3
        //CAN NOT REMOVE ELEMENTS INSIDE FOR EACH LOOP
        //SO ONLY OPTION OTHER THAN removeIf method is to use Iterator

        Iterator<Double> itr = allPrices.iterator();
        while (itr.hasNext()){
            if (itr.next() > 3){
                itr.remove();
            }
        }
        System.out.println(groceryPrice);






    }
}
