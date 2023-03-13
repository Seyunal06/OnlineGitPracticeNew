package Day45;

public class Phone extends Electronic {

    //Sub class inherit every instance field and static field
    //Sub class inherit every visible instance method and static method
    double size;
    double price;


    //Not a good idea to have main in here
    //but we are doing it so that we dont have
    // too many screens to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand ="Apple";

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        //directly accessing the static field of same class in static method
        System.out.println(useElectricity);

        //how to call showBrand method
        p1.showBrand();

        //how to call displayUseElectricity static method
        displayUseElectricity();
        //STATIC WAY
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();


    }

}
