package Day32;

import java.util.Arrays;

public class ArrayWithMethod {
    public static void main(String[] args) {

        //2 different ways
        printArrayItems(new int[] {1,6,5,3,12,3});

        int[] scores ={2,5,8,23,4,5,6};
        printArrayItems(scores);

        int[] find = {5,87,23,45,67,21,56};
        printMaxArray(scores);

        printMinArray(scores);

        //Ctrl key will take you directly to the method
        printSumArray(scores);

        compare2Array(new String[] {"Seyma","Unal"}, new String[]{"Marcos","Gonzalez"});
        String[] names1={"Superman", "Batman","Flash"};
        String[] names2={"Cyborg","Aquaman"};

        compare2Array(names1, names2);

    }
    public static void printArrayItems(int[]nums){
        System.out.println("Arrays have items : "+ Arrays.toString(nums));

    }
    public static void printMaxArray(int[]num){

        int max = num[0];

        for (int x = 0; x< num.length;x++){
           if (max < num[x]){
               max = num[x];
           }
        }
        System.out.println("max--> " + max);

    }
    public static void printMinArray (int[] noms){
        int min = noms[0];

        for (int i = 0; i < noms.length;i++){
            if (min > noms[i]){
                min = noms[i];
            }
        }
        System.out.println("min--> " + min);

    }

    public static void printSumArray (int[] nums){

        int sum = 0;

        for (int each : nums){
            sum += each;
        }
        System.out.println("sum--> " + sum);
    }
    public static void compare2Array(String[] arr1, String[] arr2){

        if (arr1.length > arr2.length){
            System.out.println("Array 1 has more items ");
        }else if (arr1.length < arr2.length){
            System.out.println("Array 2 has more items ");
        }else {
            System.out.println("they have same item count");
        }
    }














}
