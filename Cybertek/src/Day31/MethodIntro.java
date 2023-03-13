package Day31;
// we use methods bc they are reusable !avoiding duplicated code

public class MethodIntro {
    public static void main(String[] args) {
        // we use methods bc its reusable
        // to avoid code being duplicated

        // there is 2 ways to CALL static method
       // MethodIntro.sayHello();
        sayHello();
        System.out.println("in the main");
    }// MAIN METHOD DONE HERE
    public static void sayHello(){

        System.out.println("helloooo");
    }
}
