package Day34;
//noticing that they import
import Day31.CalculatorV2;

public class MathAction {
    public static void main(String[] args) {

        int result1 = MethodPracticeNumbers.build3Digit(3,7,6);
        System.out.println(result1);

        //calling other methods
        //ctrl shift i to have the little pop up of the code
        //click calculate in this example
        CalculatorV2.calculate('-',80,30);

    }
}
