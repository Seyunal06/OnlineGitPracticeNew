package BootCamp.Day4;

public class BigONotation {
    public static void main(String[] args) {
        //Big O notation, is an expression that states how efficient
        //your algorithm is.
        //O(n) >> that means based on the number of ("n") data
        //your time complexity will increase

        double[] array1 = new double[1000];

        int sum =0;

        //O(n^2)
        //1000 times here
        for (int i = 0; i < array1.length; i++){
            //1000x1000 times here
            for (int j = 0; j < array1.length; j++){
                array1[j]+=1;
            }
        }











    }

}
