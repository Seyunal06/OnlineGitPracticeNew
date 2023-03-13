package Day25;

import java.util.Arrays;

public class CheckArray {
    public static void main(String[] args) {

        //IS ARRAY SORTED OR NOT CHECK?

        int[] nums = {13,31,8,5,21,2};
        int numsSize = nums.length;

        System.out.println(Arrays.toString(nums));

        int[] numsCopy= new int[numsSize];
        //nums[0] is if we dont know the num
//        numsCopy[0] = nums[0]; //13 is if we know the num to copy
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        for (int x = 0; x < numsSize; x++) {
            numsCopy[x] =nums[x];
        }

        System.out.println("before sort - " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("after sort - " + Arrays.toString(numsCopy));

        if(Arrays.equals(nums,numsCopy)){
            System.out.println("this array is sorted");
        }else{
            System.out.println("this array is not sorted");
        }
    }
}
