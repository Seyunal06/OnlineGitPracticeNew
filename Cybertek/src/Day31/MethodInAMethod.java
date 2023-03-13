package Day31;

public class MethodInAMethod {
    public static void main(String[] args) {

        //calling both methods from one method
        theTwoThings();
    }
    public static void theTwoThings(){
        //this is combining the two methods
        firstThing();
        secondThing();
    }
    public static void firstThing(){
        System.out.println("wake up");
    }
    public static void secondThing(){
        System.out.println("eat breakfast");
    }
}
