package Day39;

public class Garage {
    public static void main(String[] args) {

        //Create car object using Class
        //or
        //Get an instance of Car Class
        Car car1 = new Car();

        car1.make = "Toyota";
        car1.color = "red";
        car1.model = "4 runner";
        car1.year = 2020;

        car1.goForward();
        car1.printAge();
        car1.changeColorTo("Blue");
        System.out.println("car1.color--> " + car1.color);

        System.out.println("Car 1--> "+car1.make);
        System.out.println("Car 1--> "+car1.year);

        Car car2 = new Car();

        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";

        car2.goForward();
        car2.printAge();

        System.out.println("Car 2--> "+car2.model);
        System.out.println("Car 2--> "+car2.color);

        //change year
        car2.year = 2020;
        System.out.println("Car 2 year--> "+car2.year);

        //I want the car2 to have the same color with car1
        car2.color = car1.color;
        System.out.println("with new color--> "+car2.color);


    }
}
