package Day44;

//what is inherited from Super class

//fields and methods that are visible to the sub class are inherited
//constructors are not inherited

public class Train extends Vehicle{

    int wagonCount;

    public void makeChoChoSound(){
        System.out.println("CHO CHOOOOO");
    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.makeChoChoSound();
        //these attributes we got from Vehicle
        t1.make = "Thomas";
        //t1.year = 1999; Private is not inherited
        t1.setYear(1999);
        System.out.println(t1.getYear());
        //calling the method we got from Vehicle
        t1.start();
        t1.goForward();

    }

















}
