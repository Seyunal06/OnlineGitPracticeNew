package Day59;

public class ThrowingExceptionProgrammatically {
    public static void main(String[] args) {

        NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println(e2.getMessage());
        //how do I programmatically throw exception myself
        //we use throw keyword followed by exception object
        //or the variable that points to the exception object
        throw e2;//throw is a keyword that has one purpose of throwing the exception to the runtime



    }

}
