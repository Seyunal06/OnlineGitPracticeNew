package Day20;

public class ReverseNameLoop {
    public static void main(String[] args) {

        //             0123456789
        String name = "Seyma Unal";
        String reversedName = "";


        for(int i = 9; i >= 0; i--){
            System.out.print(i + " Index of: ");
            char currentChar = name.charAt(i);
            System.out.println(currentChar);
            reversedName = reversedName + currentChar;
        }
    }
}
