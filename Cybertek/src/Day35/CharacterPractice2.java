package Day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        char myChar = '7';
        //get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("my num = "+ myNum );

        //Character.toString(myChar); another way
        //String.valueOf(myChar);

        String str = "A34B123C4X";
        //check every char if its a number
        char[]allChar= str.toCharArray();
        int sum = 0;

        for (char each:allChar) {
            if (Character.isDigit(each)){
                System.out.println("each = "+each);
                int eachNum = Integer.parseInt(each+"");
                sum = sum + eachNum;
            }
        }
        System.out.println("The sum "+ sum);

    }
}
