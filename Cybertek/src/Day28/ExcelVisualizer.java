package Day28;

import java.util.Arrays;

public class ExcelVisualizer {
    public static void main(String[] args) {


        int[] row1 = new int[] {78,54,100,84};
        int[] row2 = new int[] {33,44,77,123};
        int[] row3 = new int[] {12,88,52,76};
        int[] row4 = new int[] {67,33,98,67};
        int[] row5 = new int[] {12,88,52,45};
        int[] row6 = new int[] {67,33,98,34};

        int [][] sheet = new int[][]{row1,row2,row3,row4,row5,row6};


        int[][] myExcel = {{10,27},{87,99,100},{90,45}};

        System.out.println(myExcel[1][2]);
        System.out.println(myExcel[2][0]);
        System.out.println(Arrays.toString(myExcel[1]));

        System.out.println(myExcel.length);

        System.out.println("=====================");
        for (int x=0; x < myExcel.length; x++){
            System.out.println(myExcel[x].length);
        }











    }
}
