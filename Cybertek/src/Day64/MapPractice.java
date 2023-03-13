package Day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        //What if we want to have multiple value for one key??

        //Key data type is String, value data type is List<String>
        Map<String, List<String>>  groups = new HashMap<>();

        groups.put("BugHunter", Arrays.asList("Seyma","Unal","Mom","Dad"));
        groups.put("Achievers", Arrays.asList("Marcos","Gonzalez","Sister","Brother"));

        System.out.println(groups);

        groups.forEach((groupCode,allMembers)-> System.out.println(groupCode+"\n\t"+allMembers));

        //get my name
        System.out.println(groups.get("BugHunter").get(0));
        //check whether this map has Marcos or not?
            //get method is coming from Map| contains method is coming from List
        //because the values are List<String> get method will return the entire List
        System.out.println(groups.get("Achievers").contains("Marcos"));

        //we want to add a group entry so we can add or remover members from the group
        groups.put("Justice League", new ArrayList<>(Arrays.asList("Superman","Batman","WonderWoman")));
        groups.get("Justice League").add("Flash");
        System.out.println(groups.get("Justice League"));

        //the key for the Map should be a type Immutable
    }
}
