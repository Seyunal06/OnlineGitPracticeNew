package Day49;

//interface is like a contract,
//once someone sign a contract he will provide all the details he must do
public interface Edible {

    //you can have as many constants as you want
    public static final boolean IS_FOOD= true;

    void eat();
    public abstract void drink();
    //you add like this so that it doesnt break the code
    //it must have a body
    //default keyword here is NOT AN ACCESS MODIFIER
    default void digest(){
        System.out.println("YOU IMPLEMENT THE CODE YOURSELF");
    }

}

