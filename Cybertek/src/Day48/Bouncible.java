package Day48;

public interface Bouncible {

    //all the members in interface must be public
    //THIS IS A EXCLUSIVE TO INTERFACE TYPE
    //NOWHERE ELSE DOES THIS
    //if we dont add any part of public static final for the field
    //all the interface field are automatically public static final
    //double GRAVITY =9.81;
    public static final double GRAVITY =9.81;

    //every member of interface is automatically public
    //if no access modifier is given
    //all the method with no body automatically is public abstract
    //void bounce();
    public abstract void bounce();


}
