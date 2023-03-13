package Day49;

public interface Chargeable {

    public default void charge(){
        System.out.println("Default charge, "+
        "you may want to do it on your own");
    }
}
