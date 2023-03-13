package Day34;

import java.util.Arrays;

public class MethodOverLoadIntro {
    public static void main(String[] args) {

        System.out.println("Seyma");
        System.out.println(3);

        //             01234567890
        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        System.out.println("-----------------------");

       // Arrays.toString has 9 different version to accept different parameter

        //Method overLoading :
        //using same name and different parameter for methods
        //to to reuse the name for similar actions

        //method name + parameter list = method signature
        sayHello();
        sayHello("Seyma");// called argument
        sayHello(100);
        System.out.println(sayHello("Seyma","Unal"));

    }
    public static void sayHello(){
        System.out.println("Hello World");
    }
    public static void sayHello(String name){
        System.out.println("Hello, "+ name);
    }
    public static void sayHello(int num){
        System.out.println("Hey " + num);
    }
    public static String sayHello(String first, String last){

        return"Hello " + first+ " " + last;
    }


}
