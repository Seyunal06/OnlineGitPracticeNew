package Day20;

public class FidingChar {
    public static void main(String[] args) {

        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        int lastCharIndex = msg.length() -1;

        for(int x = 0; x <= lastCharIndex-2; x++){
            String threeChar = msg.substring(x, x+3);

            if(threeChar.equalsIgnoreCase("dog")){
                System.out.println("Found it at " + x);
            }
        }
    }
}
