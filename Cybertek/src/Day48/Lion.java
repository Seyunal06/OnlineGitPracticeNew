package Day48;

public class Lion extends Mammal{

    public static void main(String[] args) {
    Lion l1 = new Lion();
    l1.drinkMilk();
    l1.makeNoise();

    //any class you create, it can be a data type for a variable
        //also known as reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

}
    @Override
    public void drinkMilk() {
        System.out.println("Lion drinks milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("ROARRRRRR!");

    }



//    public abstract void makeNoise();
//    public abstract void drinkMilk();











}
