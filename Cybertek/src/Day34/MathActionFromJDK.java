package Day34;

public class MathActionFromJDK {
    public static void main(String[] args) {

        //where is the String class coming from?
        //its coming from a package called java.lang
        //its a special package
        //and any class in it, does not need importing when being used
        //for example String class

        //if your really want to import String class
        //import java.lang.String
        //we don't need to import it
        String str = "Hello";

        int sum = Math.addExact(10,20);
        System.out.println(sum);

        System.out.println("Max is " + Math.max(10,20));

    }
}
