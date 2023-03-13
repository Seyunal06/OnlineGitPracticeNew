package Day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(getList1ToEnd(7));
        System.out.println(getList1ToEnd(2));
        System.out.println(getList1ToEnd(20));

        List<Integer> myList = getList1ToEnd(25);
        System.out.println(myList);

    }
    //Create a method that accept a finalNumber as int
    //Return an ArrayList of an Integer containing numbers
    //starting from 1 till finalNumber

    /**
     * This method will return a List of Integer that contains numbers
     * starting from 1 to finalNumber
     * @param finalNumber This is the last item of the list
     * @return List<Integer> that contains 1 to finalNumber increased by 1
     */
    public static List<Integer>getList1ToEnd(int finalNumber){

        List<Integer>nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
       // System.out.println(nums);
        return nums;
    }


}

