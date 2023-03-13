package Day14;

public class TrimAndEmpty {
    public static void main(String[] args) {

        //                012345678912345678
        String message = "    Repl is coming";

        System.out.println(message);
        System.out.println("message character count is " + message.length());

        message = message.trim();
        System.out.println(message);
        //System.out.println(message.trim());
        System.out.println("message character count is " + message.length());

        System.out.println("\nis the message empty?");
        System.out.println(message.isEmpty());
    }
}
