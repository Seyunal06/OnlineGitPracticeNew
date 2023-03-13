package Day49;

public class Tesla extends Vehicle implements Autonomous,Chargeable{

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    //You have but you dont see
//    public void charge(){
//        System.out.println("Default charge, "+
//                "you may want to do it on your own");

//    public void goForward(){
//        System.out.println("Vehicle is going forward");
//    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla model "+model+" self driving");
    }

    @Override
    public void start() {
        System.out.println("Tesla model "+model+" starts with electricity");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
