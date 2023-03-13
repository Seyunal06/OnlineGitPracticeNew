package Day23;

public class WarmUpArray {
    public static void main(String[] args) {

        //first way
        int [] nums = new int[7];
        nums[0] = 11;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 4;
        nums[4] = 53;
        nums[5] = 6;
        nums[6] = 3;

        //second way with values already filled in
        int[] nums2 = new int[]{11, 2, 23, 4, 53, 6, 3};

        //third way shortest way
        int[] nums3 = {11, 2, 23, 4, 53, 6, 3};

        for (int x = nums.length-1; x >= 0; x--) {
            System.out.println("item = " + nums[x]);
        }

        int arraySize = nums.length;
        int lastItemIndex= arraySize-1;

        int lastItemValue = nums[lastItemIndex];
        System.out.println("last item value = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("median = " + nums[middleItemIndex]);

        int sum = 0;
        for(int x = 0; x < arraySize; x++){
            //one way
            //int currentItem = nums[x];
            //sum = sum + currentItem;
            //other way
            sum = sum + nums[x];
        }
        System.out.println("sum = " + sum);
    }
}
