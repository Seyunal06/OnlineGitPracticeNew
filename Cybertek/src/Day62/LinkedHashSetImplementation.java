package Day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;


public class LinkedHashSetImplementation {
    public static void main(String[] args) {


        //if you want to keep the order in the way that you wrote it
        //removes duplicates
        //sub class of HashSet
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(10);
        nums.add(22);
        nums.add(13);
        nums.add(13);
        nums.add(30);
        nums.add(30);

        System.out.println(nums);

        //faster because it has less job to do
        //only removes duplicates
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(10);
        nums2.add(10);
        nums2.add(22);
        nums2.add(13);
        nums2.add(13);
        nums2.add(30);
        nums2.add(30);

        System.out.println(nums2);

    }
}
