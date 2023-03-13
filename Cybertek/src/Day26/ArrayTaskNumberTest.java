package Day26;

public class ArrayTaskNumberTest {
    public static void main(String[] args) {



        int[] scores = {156,101,76,187,87,110};

        String finalResult = "";

        int countLessThan100 = 0;

        for (int eachNum:scores) {
            if (eachNum <= 100) {

                System.out.println(eachNum);
                countLessThan100++;
            }
        }
        System.out.println(countLessThan100);
        if (countLessThan100 > 0){
            finalResult = "No";
        }else {
            finalResult = "Yes";
        }
        System.out.println("Final result ---> " + finalResult);



    }
}
