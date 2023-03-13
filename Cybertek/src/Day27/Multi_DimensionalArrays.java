package Day27;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        //Single dimensional array: contains values
        // int[] arr={1,2,3}

        //Multi-dimensional array: contains another array(s)


        int[] arr1D = {1,2,3};
        //                0 1 2    0 1 2
        int[][] arr2D = {{1,2,3}, {4,5,6}};
        // index           0         1

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        //how to call the first index 3rd element
        System.out.println(arr2D[0][2]);

        System.out.println(arr2D[1][1]);

        //Arrays.deepToString(multi-d Arrays);
        System.out.println(Arrays.deepToString(arr2D));

    }
}
