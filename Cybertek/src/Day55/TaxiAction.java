package Day55;

public class TaxiAction {

    public static void main(String[] args) {

        //making an object
        Engine en = new Engine("V6",400);
        Driver d = new Driver("Seyma",12345);
        Taxi t1 = new Taxi(101,en,d);
        //getting first character of this driver
        System.out.println(d.name.charAt(0));


        System.out.println("t1 = " + t1);

        //directly printing it out
        Taxi t2 = new Taxi(102,
                new Engine("V8",600),
                new Driver("Marcos",12345));
        System.out.println("t2 = " + t2);

        System.out.println(t2.dr.name+" is driving the taxi with " +
                "horsepower "+t2.eng.horsePower+" on the high way");


    }

}
