package Day27;

import java.util.Arrays;

public class MultiDimArray3Dpt2 {
    public static void main(String[] args) {

        int[][][] arr3D = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        for (int i = 0; i < arr3D.length; i++){
            for (int j = 0; j < arr3D[i].length;j++){
                for (int k = 0; k < arr3D[i][j].length;k++){
                    System.out.println(arr3D[i][j][k]);
                }
            }
        }






















    }
}
