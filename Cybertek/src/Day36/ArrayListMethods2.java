package Day36;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<Long>lst = new ArrayList<>();
        //C.R.U.D.
        // create, read, update, delete
        //add item, read item, update item, remove item, check location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L); bc ArrayList only stores objects
        lst.add(100L);
        lst.add(200L);
//        practically you will not add null, but its possible
//        lst.add(null);//you can add null element into a list

        System.out.println("checking the size --> "+lst.size());
        System.out.println(lst);
        // I want to insert 125 between 100L and 200L
        lst.add(2,125L);
        System.out.println(lst);

        System.out.println(lst.get(3));

        //update value
        lst.set(3,195L);
        System.out.println("new value for lst.get(3) = \n\t" +lst.get(3));

        //removing item by its value
        lst.remove(100L);
        System.out.println(lst);

        lst.remove(2);
        System.out.println(lst);

        System.out.println("lst.size()>0 = " + (lst.size()>0));
        System.out.println();
        System.out.println("is lst empty? " + lst.isEmpty());

        //how do I delete everything from my ArrayList
//        lst.clear();
//        System.out.println("checking after lst.clear \n"+lst.isEmpty());

        //checking if we have certain item or not
        System.out.println("do we have 100L ? " +lst.contains(100L));

        //how do I check whether a list contains an item without using contains
        //use indexOf method, if it returns -1, it means we dont have it
        System.out.println("DO I HAVE 10L? "+(lst.indexOf(10L)!=-1));


    }
}
