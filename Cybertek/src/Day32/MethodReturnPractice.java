package Day32;

public class MethodReturnPractice {
    public static void main(String[] args) {

        System.out.println(divide(10,5));

        System.out.println(divide(10,0));
        System.out.println(divide(0,10));

    }
    public static double divide(double num1, double num2){

        // to avoid getting infinity
        if (num2 == 0){//checking if num2 is 0
            return 0; // if it is we return 0
        }else {
            return num1/num2;
        }

    }
}
