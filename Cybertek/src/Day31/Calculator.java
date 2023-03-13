package Day31;

public class Calculator {
    public static void main(String[] args) {

        add(2,3);
        add(16,3);
        add(1,6);
        add3Num(3,4,5);
    }
    public static void add(int num1, int num2){

        System.out.println("result " + (num1+num2) );
    }
    public static void add3Num(int item1, int item2, int item3){

        System.out.println("result of adding 3 items " + (item1+item2+item3));
    }
}
