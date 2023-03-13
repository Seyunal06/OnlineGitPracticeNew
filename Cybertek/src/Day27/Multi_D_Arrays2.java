package Day27;

import java.util.Arrays;

public class Multi_D_Arrays2 {
    public static void main(String[] args) {

        //                    0         1             0       1
        String[][] names ={{"Unal", "Gonzalez"}, {"Seyma", "Marcos"}};
        //                         0                     1

        System.out.println(names[1][0]);
        System.out.println(names[1][1]);

        names[1][1] = "bebe";
        System.out.println(names[1][1]);
        System.out.println(Arrays.toString(names[1]));

        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};

        System.out.println(Arrays.toString(names[0]));

        System.out.println("______________________________");
        for (int x = 0; x < numbers.length; x++) {
            System.out.println(Arrays.toString(numbers[x]));
            for (int i = 0; i < numbers[x].length; i++) {
                System.out.println(numbers[x][i]);
            }
        }
        System.out.println("___________________________");

        int [][] ages = {{10},{12,13,14,16,17},{19,20,21,22,23}};

        for (int y = 0; y < ages.length; y++) {
            //System.out.println(Arrays.toString(ages[y]));
            for (int z = 0; z < ages[y].length; z++) {
                if (ages[y][z] % 2 != 0){
                    continue;
                }
                System.out.print(ages[y][z]+" ");
            }
        }
        System.out.println("\n-----------for-each-loop--------------------");

        int[] arr1D = {1,2,3};

        for (int each :arr1D) {
            System.out.print(each + " ");
        }
        System.out.println("\n-----------for-each-loop--------------------");

        int[][] arr2D = {{10,20,30},{40,50,60,70,80,90,100}};

        for (int[] each2D:arr2D) {
            for (int eachElement : each2D) {
            System.out.println(eachElement);
        }
        }

    }
}
