package Day13;

public class UppercaseLowercaseString {
    public static void main(String[] args) {

        String s1 = "Hello";
        //to check for true or false for string
        System.out.println(s1.equals("abc"));
        //this is to check for the word but ignores the case
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        //this is to make it uppercase
        System.out.println(s1.toUpperCase());
        //lowercase
        System.out.println(s1.toLowerCase());
        // to get the length
        System.out.println(s1.length());
    }
}
