package Day15;

public class CharacterCount {
    public static void main(String[] args) {

        String name = "Seyma";
        int characterCount = name.length();
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println(lastChar);
        System.out.println(name.charAt(name.length() -1));
    }
}
