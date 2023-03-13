package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAList {
    public static void main(String[] args) {

        //reversing an ArrayList object
        List<Integer>nums = new ArrayList<>(Arrays.asList(200,100,700,400,500));
        System.out.println(nums);

        //200,100,700,400,500
        //after revering
        //500,400,700,100,200

        //after sorting in reverse order line 15
        //700,500,400,200,100

        Collections.reverse(nums);
        System.out.println("after reverse-->"+nums);

        Collections.sort(nums,Collections.reverseOrder());//or Comparator.reverseOrder()
        System.out.println("after sorting reverse order--> "+ nums);



    }
}
