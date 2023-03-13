package Day39;

public class Car {


    int year;
    String model;
    String make;
    String color;
    //or you can do it in one shot-> String model,make,color


    public void goForward(){
        System.out.println(make + " Going forward");
    }

    //Create a method to print how old the car is
    public void printAge(){
        System.out.println("Car age: "+ (2020-year));
    }

    //Create a method to change the color
    public void changeColorTo(String newColor){
        //Write bunch of code here to validate
        //user is actually passing correct color
        //for example Red,Blue is valid color
        //            ABC,EFG is not valid color
        color = newColor;
    }


    //instance methods are tied to the object
    //it does not have static keyword
    //we need an object we call them

}
