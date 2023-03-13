package Day43;

public class StarbucksUtil {
    public static void main(String[] args) {

        Coffee c1 = new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c1);
        System.out.println(c1);

        printStringInfo("hello");

        Coffee c2 = new Coffee();
        printCoffeeInfo(new Coffee("Intensito",10));

    }
    //create a static method to accept a coffee object and print its info
    //like this: this coffee is: name, price is <price>,caffeine level is <level>
    public static void printCoffeeInfo(Coffee co){
        System.out.println("this coffee is: "+co.getType());

    }
    public static void printStringInfo(String str){
        System.out.println("first character is "+str.charAt(0));
        System.out.println("last character is "+str.charAt(str.length()-1));
    }







}
