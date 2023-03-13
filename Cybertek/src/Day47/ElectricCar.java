package Day47;

public class ElectricCar extends Car {

    int batterLevel;


    @Override
    public void start() {
        System.out.println("this is how electric car starts");
    }

    @Override
    public void goForward() {
        System.out.println("going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turning " + direction);
    }









}
