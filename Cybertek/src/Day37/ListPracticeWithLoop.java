package Day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        /*
         * Create an ArrayList of Integer and fill it up with 1-100
         */

         List<Integer> nums = new ArrayList<>();
         for (int number = 1;number<=100; number++){
             //System.out.println(number);
             nums.add(number);
         }
        System.out.println(nums);
         //change all odd nums to 0

        for (int i = 0; i < nums.size(); i+=2) {
            //System.out.println(i);
            nums.set(i,0);
        }

        System.out.println(nums);

        //find the index of 20:
        System.out.println("Index of 20 is --> "+ nums.indexOf(20));


        //insert 100 to the first index:
        nums.add(0,100);
        System.out.println(nums);


    }
}
