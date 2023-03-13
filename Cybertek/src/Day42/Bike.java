package Day42;

public class Bike {


    int speed;
    int gear;

    //Constructor is a block of code
    //that has same name as classname
    // and has no return type
    //the only time you can call it
    // is when object is being created
    public Bike(){
        System.out.println("message from constructor");
        gear =1;
    }
    public Bike(int gear){
        this.gear = gear;
    }
    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    //this does nothing to the gear and speed
    public Bike(String str){
        System.out.println("Accept String");
    }





}
