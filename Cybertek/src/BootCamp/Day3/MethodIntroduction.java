package BootCamp.Day3;

//if the object is apple pie, the class is the recipe
public class MethodIntroduction {

    //constructor is a special method that has the same name with the Class name
    //and no return type
    public MethodIntroduction(){

    }

    //static methods belongs to the class
    //non-static methods belong to the object
    //to be able to use a static method, first use the class name
    //to be able to use a non-static method, create an instance from that class

    public static void main(String[] args) {
        //functions and method is the same thing
        // by convention a method shouldn't be more than 50(max) lines of code

        method(10);
        //Math is a final class that we can not extend
        Math.addExact(10,6);

    }
    public static int method(int number){
        //return type is not a part of the method signature
        return 0;
    }
    public static void method(){
        System.out.println("Void method does not have a return type");

    }





}
