package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs","Milk","Butter","Apple","Salmon");
        System.out.println(groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries) ;
        newLst.add("Coke");
        newLst.add("Sugar");
        System.out.println(newLst);

        List<String>newItemsAdd = Arrays.asList("Pasta","Branzini","Asparagus","Spinach");
        //ADDING ONE LIST TO ANOTHER LIST
        newLst.addAll(newItemsAdd);
        System.out.println(newLst);





    }
}
