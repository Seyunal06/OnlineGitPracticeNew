package Day15;

public class Replace {
    public static void main(String[] args) {

        String message = "why are you so ugly?";
        //always case sensitive
       message = message.replace("ugly", "beautiful");
        System.out.println(message);
    }
}
