package Day45;

public class Apple extends Fruit {

    //if we dont have any constructor
    //we will get default constructor
    //and compiler automatically call
    //no arg constructor of super class by inserting super()


//    //first line of any constructor is automatically calling
//    //super() if we dont call any
//    public Apple(){
//        //I want to reuse the functionality
//        //already written in super class constructor
//        //we can use super() or super(arguments here)
//        //to call super class's constructor
//       // super();
//
//        //how to call constructor with 1 argument
//        super("test");
//
//        //CANT USE MORE THAN ONE SUPER()
//       // System.out.println("Message from apple constructor");
//    }

    public static void main(String[] args) {

        Apple a1 = new Apple();
    }






}
