package Day49;

public class Burger implements Edible,Juicy{

    //you have but you cant see
    //public static final boolean IS_FOOD= true;
    //you have constructor but you dont see
//    public Burger(){
//        super();
//    }

    @Override
    public void eat() {
        System.out.println("Eating burger with a big bite");
    }

    @Override
    public void drink() {
        System.out.println("drink soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
