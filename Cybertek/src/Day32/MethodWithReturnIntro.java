package Day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {

        String name = giveMyName();
        System.out.println("name= "+ name);
        int myResult = doubleNum(10);
        System.out.println("My result= " + myResult);

        System.out.println("doubling 100 is " + doubleNum(100));

        int addToResult = add2Numers(14,16);
        System.out.println("Add them " + addToResult);
        System.out.println(add2Numers(14,16)  + 5 );

    }

    public static int add2Numers(int num1, int num2){
        //int sum = num1 + num2;
        //return sum;

        return num1 + num2;
    }
    public static int doubleNum(int num){
        System.out.println("going to double the number "+ num);
        int result = num *2;
        return result;
    }

    public static String giveMyName(){

        return "Seyma";
    }
}
