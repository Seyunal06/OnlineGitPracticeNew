package BootCamp.Day4;

public class FindTheMostDuplicatedElement {
    public static void main(String[] args) {

        int[] arr = {8, 8, 8, 8, 4, 4, 5, 5, 5, 5, 5, 5, 7, 7, 1, 1, 1};

        //this will count the duplicated numbers
        int count = 0;
        //this wil store the largest duplicated number
        int maxCount = 0;
        int mostRecurringElement = arr[0];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                mostRecurringElement = arr[i];
            }
        }
        System.out.println(maxCount);
        System.out.println("the most recurring element is " + mostRecurringElement);








    }
}
