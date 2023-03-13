package Day26;

public class ArrayTaskNumTest2 {
    public static void main(String[] args) {

        int[] scores = {156,101,76,187,87,110};
        int size = scores.length;
        System.out.println("size = " + size);


        String finalResult ="";
        int countMoreThan100 = 0;

        for ( int eachNum:scores) {

            if (eachNum>100){
                ++countMoreThan100;
            }
        }
        System.out.println(countMoreThan100);

        if(countMoreThan100 == size){
            finalResult = "YES";
        }else {
            finalResult = "NO";
        }
        System.out.println(finalResult);
        
    }
}
