package Day31;

public class CalculatorV2 {
    public static void main(String[] args) {

//        char operator = '+'; // + - * /
//        int num1 = 15;
//        int num2 = 3;
        calculate('-',80,30);
        calculate('+',20,10);
        calculate('*',7,8);
        calculate('/',6,24);
        calculate('A',60,30);
    }
    public static void calculate(char operator, int num1, int num2){

        switch (operator){
            case '+':
                System.out.println("adding --> "+ (num1+num2));
                break;
            case '-':
                System.out.println("minus --> "+ (num1-num2));
                break;
            case '*':
                System.out.println("multiply --> "+ (num1*num2));
                break;
            case '/':
                System.out.println("dividing --> "+ (num1/num2));
                break;
            default:
                System.out.println("INVALID");
        }
    }
}
