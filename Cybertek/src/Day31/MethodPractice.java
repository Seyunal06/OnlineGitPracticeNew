package Day31;

public class MethodPractice {
    public static void main(String[] args) {
        sayMyName();
        //calling from another class -->
        MethodIntro.sayHello();
        numbers();
    }
        public static void sayMyName(){
            System.out.println("Your name is Seyma");
    }
    public static void numbers(){
        System.out.println("1234567890");
    }
}
