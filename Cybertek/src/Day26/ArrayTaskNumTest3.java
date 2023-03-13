package Day26;

public class ArrayTaskNumTest3 {
    public static void main(String[] args) {


        int[] scores = {156,101,76,187,87,110};
        int size = scores.length;
        System.out.println("size = " + size);


        String finalResult ="YES";

        for ( int eachNum:scores) {

            if(eachNum <= 100){
                //is at least one number less than 100
                finalResult= "NO";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);




    }
}
