package Day22;

public class LoopArray {
    public static void main(String[] args) {

        int [] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);

        int itemCount = scores.length;
        int lastIndex = itemCount -1;

        for (int x = 0; x < itemCount; x++) {
            System.out.println(scores[x]);
        }

        String name = "Seyma";
        int charCount = name.length();
    }
}
