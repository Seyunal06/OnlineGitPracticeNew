package Day36;

import java.util.Arrays;

public class MethodParameterArray {
    public static void main(String[] args) {

        int[] nums = {1,5,3,4,7,2};
//        System.out.println("before sorting "+Arrays.toString(nums));
//        Arrays.sort(nums);
//
//        System.out.println(Arrays.toString(nums));
        changeFirstItemTo100(nums);
        System.out.println(Arrays.toString(nums));

        //when you pass a variable to a method parameter:
        //you are only passing the copy of that variable
        //for primitives --> the copy holds the value itself
          //changing the value does not change original value passed

        //for reference type --> the copy holds the same address of the object
          //changing the value will affect original object
          //because both method parameters and passed variables are pointing to the same object
    //THIS IS WHAT WE CALL PASS-BY-VALUE
        //when you pass a variable to a method parameter:
        //you are only passing the copy of that variable
    }
    //this is what happens when you pass nums to this method
//    public static void changeFirstItemTo100(){
//        numbers variables are copying whatever is inside nums
//        what is inside nums varaiable? --> address of Array Object
//        so now numbers has same address of the object as nums
//        int[] numbers = nums;
//        numbers[0] = 100;
//    }

    /**
     *
     * @param numbers
     */
    public static void changeFirstItemTo100(int[] numbers){
        numbers[0] = 100;
    }
}
