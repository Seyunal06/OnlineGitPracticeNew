package Day27;

import java.util.Arrays;

public class MultiDArr3 {
    public static void main(String[] args) {

        int[][] numbers = {{12,11,10,19},{19,20,15},{100,90,89,7888}};

        int max = numbers[0][0];

        for(int x = 0; x<numbers.length;x++){
            for(int y=0; y<numbers[x].length;y++){
                if (max< numbers[x][y]){
                    max = numbers[x][y];
                }
            }
        }
        System.out.println(max);

        int max2 = max;
        for (int[] eachArray : numbers) {
            for (int eachInt : eachArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;
                }
            }
        }
        System.out.println(max2);


        //find smallest
        int small = numbers[0][0];
        for (int i=0; i<numbers.length;i++){
            for (int j=0; j <numbers[i].length; j++){
                if (small > numbers[i][j]){
                    small = numbers[i][j];
                }
            }
        }
        System.out.println(small);

    }
}
