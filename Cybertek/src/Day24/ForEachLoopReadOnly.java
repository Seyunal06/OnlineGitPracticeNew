package Day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {

        int yourFavNum = 300;
        int myFavNum = yourFavNum;

        myFavNum = 299;

        System.out.println(yourFavNum);
        //dont use foreach loop for a modifying data
        // interview Q

        int[] nums = {10, 40 , 20};
       // nums[0] *= 2;
        //doubling one

        for (int x = 0; x < 3; x++) {
            nums[x] *= 2;
            //doubling all
            System.out.println(nums[x]);
        }
    }
}
