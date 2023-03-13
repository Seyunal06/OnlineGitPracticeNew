package Day38;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer>nums = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println("Before--> " + nums);
        //2 WAYS TO SORT AN ARRAYLIST
        //Use Collections utility class(just like Arrays utility class for array objcts)
        //Collections is a class coming from java.util package
        //it has a lot of ready method to work with Collections objects like ArrayList and so on
        Collections.sort(nums);
        System.out.println("After sorting--> "+nums);

        //This version of sort method accepts 2 arguments
        //1st is the list to be sorted
        //2nd a Comparator Object that contains comparing logic
        //  good new is there is already a method in java
            //we can get reverse order comparator object by calling
            //Comparator.reverseOrder(), just take it and use it!
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println("nums after sort2--> " +nums);

        //List also has sort method that accepts one Comparator object
        //Simple way to get Comparator objects are
            //Comparator.naturalOrder()-->> low to high order
           //Comparator.reverseOrder()-->> high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("naturalOrder--> "+ nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("reverseOrder--> " + nums);


    }
}
