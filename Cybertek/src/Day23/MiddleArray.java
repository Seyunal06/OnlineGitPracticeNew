package Day23;

public class MiddleArray {
    public static void main(String[] args) {

        int[] nums ={11, 23, 45, 56, 67, 78, 89};

        // how to get the median
        int arraySize = nums.length;
        int middle = arraySize/2;
        System.out.println("median = " + nums[middle]);

        // how to add them all up
        int sum = 0;
        for (int x = 0; x < arraySize; x++) {
            int currentItem = nums[x];
            sum = sum + currentItem;
        }
        System.out.println("sum = " + sum);

    }
}
