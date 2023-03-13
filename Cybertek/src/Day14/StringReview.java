package Day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkins";

        System.out.println(str.equals("pum"));

        System.out.println(str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

    }
}
