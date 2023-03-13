package Day36;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<Long>lst = new ArrayList<>();
        //C.R.U.D.
        // create, read, update, delete
        //add item, read item, update item, remove item, check location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L); bc ArrayList only stores objects
        lst.add(100L);
        lst.add(200L);

        System.out.println(lst);

        //counting items inside ArrayList
        System.out.println("counting items using lst.size()= "+lst.size());

        //getting items inside ArrayList object
        System.out.println("First item is: lst.get(0)= "+lst.get(0));

        System.out.println("-----------------getting the sum");

        for (int x=0; x < lst.size();x++){

            System.out.println(lst.get(x));
        }
        long sum = 0;

        for (int x=0; x < lst.size();x++){
            sum = sum + lst.get(x);
        }
        System.out.println("sum --> " + sum);


        System.out.println("---------------max");

        long max = lst.get(0);
        for (int x=0; x < lst.size();x++){

            if(lst.get(x)> max){
                max = lst.get(x);
            }
        }
        System.out.println("max --> " + max);


    }
}
