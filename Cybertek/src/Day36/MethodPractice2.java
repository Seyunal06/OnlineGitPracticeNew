package Day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {

        long[] myLong = {6l, 11l, 44l, 32l, 65l};
        System.out.println("Before swap " + Arrays.toString(myLong));

        swapFirstAndLastValue(myLong);
        System.out.println("After swap "+ Arrays.toString(myLong));

        long[] myNums1 = new long[5];
        System.out.println("nums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("nums2 = " + Arrays.toString(myNums2));

//        String str = "abc";
//        String str2 = null; //means nothing

        int x = 0;
        Integer x1 = null;

        // ONE THING THAT PRIMITIVE VARIABLES CANT DO:
        //WE CANT ASSIGN IT TO NULL
        //ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES)
        //CAN ASSIGN TO NULL VALUE
        // TO DEFINE, ITS NOT POINTING TO ANY OBJECT YET

    }

    /**
     * Swap first and last value of long array
     * @param nums long array
     */
    public static void swapFirstAndLastValue(long[] nums){

        //just like swapping the tea in tea cup with coffee in coffee cup
        //you need a temporary cup to hold your tea so you can change it with coffee
        //nums[0], nums[nums.length-1]
        long temp = nums[0];           //tea goes into the temp cup
        nums[0] = nums[nums.length-1]; //coffee goes into the tea cup
        nums[nums.length-1] = temp;    //then tea goes into the coffee cup

    }

}
