package Day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Seyma","Female");
        employeeMap.put("Marcos","Male");
        employeeMap.put("Unal","Female");
        employeeMap.put("Gonzalez","Male");

        //you can store into a variable like this
        //or pass it directly into the for each loop
        Set<Map.Entry<String, String>> entryView = employeeMap.entrySet();

        for (Map.Entry<String, String> name : entryView) {
            if (name.getValue().equals("Female")){
                name.setValue("Queen");
            }else{
                name.setValue("King");
            }
        }
        System.out.println(employeeMap);
        //Task 1: get all the female names

        //Task 2: get all




    }
}
