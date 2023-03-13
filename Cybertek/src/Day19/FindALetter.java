package Day19;

public class FindALetter {
    public static void main(String[] args) {

        String name = "Seyma unal";

        int countOfA = 0;
        for(int x = 0; x < name.length(); x++){
            System.out.println(name.charAt(x));

            if(name.charAt(x) == 'a'){
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);

    }
}
