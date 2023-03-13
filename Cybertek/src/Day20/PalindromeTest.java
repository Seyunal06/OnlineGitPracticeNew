package Day20;

public class PalindromeTest {
    public static void main(String[] args) {

        String name = "Seyma Unal";
        String reversedName = "";

        System.out.println(name);

        for(int i = name.length() -1; i >= 0; i--) {

            reversedName = reversedName + name.charAt(i);
        }
        System.out.println(reversedName);

        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome PASSED");
        }else{
            System.out.println("Palindrome FAILED");
        }

    }
}
