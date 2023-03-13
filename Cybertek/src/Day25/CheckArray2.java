package Day25;

import java.util.Arrays;

public class CheckArray2 {
    public static void main(String[] args) {

       int[] nums = {13,31,8,5,21,2};
       // int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));

        boolean isSorted = true;

        for (int x = 0; x < nums.length-1; x++) {
            System.out.println(nums[x] + " less than " + nums[x+1] +"?  "+ (nums[x] < nums[x+1]));
            //is this less than this

            if(! (nums[x] < nums[x+1])){
                System.out.println("Array is not sorted, no point in checking the rest");
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
