package Day47;

public class Garage {

    public static void main(String[] args) {

        //Abstract class can not be instantiated
        //It means we can not create object out of it
        //Car c1 = new Car();

            ElectricCar c1 = new ElectricCar();
            c1.start();
            c1.goForward();
            c1.goBackward();
            c1.turn("Right");

        System.out.println("----------------------");
        GasCar c2 = new GasCar();
        c2.start();
        c2.goForward();
        c2.goBackward();
        c2.turn("Right");
    }
}
