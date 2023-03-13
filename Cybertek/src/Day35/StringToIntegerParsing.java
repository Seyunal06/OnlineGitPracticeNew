package Day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {


        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("number "+ num);

        String empID = "FB-457";
        /*
        * parse Integer class is a class coming from java.lang package
        * Its primarily used for wrapping up primitive value and treat it as an object
        * The focus here is
        * parseInt is a static method of Integer class
        * It will turn a String thats a number into int result
        * if we have any non-numerical character -->> it will have an error output NumberFormatException
        * */

        //ONE SHOT
        //int id = Integer.parseInt(empID.split("-")[1]);
        String[] empIDSplit= empID.split("-");
        String idStr= empIDSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println(id);

        //num 100,600
        String num1Str="100";
        String num2Str="600";

        //you dont have to
        int num1= Integer.parseInt(num1Str);
        int num2= Integer.parseInt(num2Str);

        System.out.println("sum of num1 and num2 = "+ (num1+num2));



    }
}
