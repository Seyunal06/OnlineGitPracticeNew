package Day36;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {

        //how to create an ArrayList Object

        ArrayList<String> lst1 = new ArrayList<>();

        //it will only store object, not primitive
        //ArrayList<int> lst2 = new ArrayList<>();

        //Correct way to create ArrayList object that store whole number
        //is to us Wrapper class type, primitive type is FORBIDDEN!

        ArrayList<Integer>lst2 = new ArrayList<>();// new ArrayList<Integer>();

        ArrayList<Long>lst3 = new ArrayList<>();// new ArrayList<Long>();

        ArrayList<Double>lst4 = new ArrayList<>();// new ArrayList<Double>();


        //Optionally you can create it this way
        //list is a more general data type compared to ArrayList is more concrete data type
        //ArrayList is one type of list
        List<String> mylst = new ArrayList<>();


    }
}
