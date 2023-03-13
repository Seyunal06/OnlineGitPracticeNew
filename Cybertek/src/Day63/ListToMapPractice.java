package Day63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jayden Hope");
        names.add("Charlie West");
        names.add("Amara Civan");
        names.add("Zane Gatlin");
        names.add("Grayson Adams");
        names.add("Seyma Unal");
        names.add("William Lennon");
        names.add("James Gasper");

        Map<String,Integer> nameCharPair = new HashMap<>();

        for (String eachMember: names) {
            nameCharPair.put(eachMember, eachMember.length());
        }
        System.out.println(nameCharPair);

    }
}
