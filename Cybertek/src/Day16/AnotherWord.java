package Day16;

public class AnotherWord {
    public static void main(String[] args) {

        String sentence = "I love Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(1+1,6));
        secondWord = sentence.substring(firstSpaceIndex + 1, lastSpaceIndex);
        System.out.println("Second word- " + secondWord );
    }
}
