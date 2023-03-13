package Day34;

public class MethodPracticeNumbers {
    public static void main(String[] args) {
        //public = access modifier
        //static = does not need an object to call
        //void = return type- does not return anything
        //String[] args = method parameter
        //"Seyma" the actual data that you passed is also called an argument


        //INTERVIEW Q

//        int digit1, digit2, digit3;
//        digit1 = 3;
//        digit2 = 7;
//        digit3 = 6;
//
//        int num = digit1* 100 + digit2 *10 +digit3;
//        System.out.println(num);

        int result1 = build3Digit(3,7,6);
        System.out.println(result1);

        int result2 = build3Digit(2,23,4);
        System.out.println(result2);

//        System.out.println(build3Digit(3,7,6));
//        System.out.println(build3Digit(12,23,4));

        //make sure if you have writing next to it you should
        //put parenthesis around the numbers you are adding
        System.out.println(result1+result2);
        //or you can have the string come after like this
        System.out.println(result1+result2+" bllalaallalal");

    }
    public static int build3Digit(int digit1,int digit2,int digit3 ){


        if (digit1<0 || digit1>9){
            digit1 =0;
        }
        if (digit2<0 || digit2>9){
            digit2 =0;
        }
        if (digit3<0 || digit3>9){
            digit3 =0;
        }

        int num = digit1* 100 + digit2 *10 +digit3;
        return num;
    }
}
