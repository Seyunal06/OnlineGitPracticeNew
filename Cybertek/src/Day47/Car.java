package Day47;

//I dont need to create car object using this class
// I only want this class to be super class to provide
// reusable fields and methods for sub classes
//this class is designed to be a super class

public abstract class Car {

    int year;
    String brand;

    //abstract class can have abstract class method
    //only abstract class can have abstract method
    //it has abstract keyword
    //and it does not have a body, DOES NOT HAVE{}
    //it ends with ;semi colon
    //it is meant to be overridden to provide body
    //in sub class
    public abstract void start();

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);

    public void doCarThing(){
        System.out.println("non abstract method can be in the abstract class");
    }


    //add abstract methods:
    //add goForward
    //goBackward
    //turn(String direction)


}
