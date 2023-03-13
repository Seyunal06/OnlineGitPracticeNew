package Day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {


        Map<String,Integer> nameAge = new HashMap<>();

        //adding elements: put
        nameAge.put("Seyma",24);
        nameAge.put("Unal",21);
        nameAge.put("Marcos",25);
        nameAge.put("Gonzalez",23);
        //The keys of Map is unique, it does not accept duplicate
        //it will just replace the old value with the new one
        nameAge.put("Unal",22);
        //how do I only add new items if it does not exists (java 8 addition)
        nameAge.putIfAbsent("Unal",36);


        System.out.println(nameAge);
        System.out.println("How many items: "+nameAge.size());
        System.out.println("what is unals age: "+nameAge.get("Unal"));

        //how do I check if a key already exist
        System.out.println("nameAge.containsKey(\"Unal\") = " + nameAge.containsKey("Unal"));
        System.out.println("nameAge.containsKey(\"Nur\") = " + nameAge.containsKey("Nur"));

        //Updating the element in the map using replace
        nameAge.replace("Seyma",18);
        System.out.println(nameAge.get("Seyma"));

        //updating the value only if the old value equals to a specified value
        nameAge.replace("Marcos",25,21);
        System.out.println(nameAge.get("Marcos"));

        //Remove Entry
        nameAge.remove("Unal");
        //contains key is better to check for existing element
        System.out.println(nameAge.get("Unal"));
        System.out.println(nameAge.containsKey("Unal"));


    }
}
