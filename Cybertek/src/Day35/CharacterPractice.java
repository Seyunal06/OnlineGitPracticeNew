package Day35;

public class CharacterPractice {
    public static void main(String[] args) {

        //Character class has lots of static methods
        //to perform actions on char values
        //isDigit, isLetter, isLetterOrDigit, isUpperCase, isLowerCase
        //toUpperCase, toLowerCase

        System.out.println("IS METHOD PRACTICE");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));


        String str = "A34B123C4X";
        //get num out of the string and store it into an Integer variable

        String numsInStr="";

        for (int x=0; x<str.length();x++ ){

            if(Character.isDigit(str.charAt(x))){
                System.out.println("str.charAt("+x+")= " + str.charAt(x));
                numsInStr += str.charAt(x);
            }
        }
        System.out.println("numInStr = "+numsInStr);
        Integer num = Integer.valueOf(numsInStr);
        System.out.println("number = " + num);






    }
}
