package Day57;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("BEFORE TRY CATCH");

        try {
            System.out.println("In try block");
            int result = 10 / 2;
            System.out.println("After 10/0 line");
        }catch(ArithmeticException e){
            System.out.println("Exception happened, and was caught and handled");
        }
        System.out.println("AFTER TRY CATCH");

        try{
            System.out.println("In second try block");
            String str = "java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened, and was caught and handled");
        }
        System.out.println("After second try catch ");

    }
}
