package Day56;

/**
 * Sometimes we want to make a class that only generates a single object
 * throughout the entire application
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();//create object here
        }else{
            System.out.println("we already have this object");
            //do not create object if it already exists
        }
        return instance;
    }
    private Singleton(){
        System.out.println("NO ARG CONSTRUCTOR IS BEING CALLED!");
    }
}
