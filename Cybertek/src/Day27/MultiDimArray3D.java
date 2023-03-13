package Day27;

import java.util.Arrays;

public class MultiDimArray3D {
    public static void main(String[] args) {


        int[][][] arr3D = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        //                         0                 1

        // print 9
        System.out.println(arr3D[1][0][2]); //returns value
        //print 2
        System.out.println(arr3D[0][0][1]);
        //print{1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0])); //returns 1d array
        //print{10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));
        //print {{7,8,9},{10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1]));
        //print all
        System.out.println(Arrays.deepToString(arr3D));

    }
}
