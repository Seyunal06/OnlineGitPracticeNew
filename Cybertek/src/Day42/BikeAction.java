package Day42;

public class BikeAction {
    public static void main(String[] args) {

        Bike b1 = new Bike("abc");
        Bike b2 = new Bike();


        //I dont want empty gear when object is created
        //I want the bike to come with gear set to 1

        System.out.println(b1.gear);
        System.out.println(b2.gear);

        //I want to be able to set the default gear to
        //any number I specify when object is being created
        Bike b3 = new Bike(4);
        System.out.println(b3.gear);

        //I want a Bike object with both
        //speed and gear set to the value I specify
        Bike b4 = new Bike(3,55);
        System.out.println(b4.gear);
        System.out.println(b4.speed);







    }
}
