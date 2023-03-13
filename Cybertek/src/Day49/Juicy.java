package Day49;

public interface Juicy {

    public abstract void melt();

    //another type of method Interface can have is:
    //static method, it must have a body
    //and its there to provide some utility methods
    //that does not belong to any class
    //STATIC METHODS of interface are NOT INHERITED
    //IT MUST HAVE A BODY
    public static void squeeze(){
        System.out.println("static squeezing");
    }

}
