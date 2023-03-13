package Day11;

public class StringThisAndThat {
    public static void main(String[] args) {

        String name = "Seyma" ; //String literal

        String name2 = new String ("Seyma") ;

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2); //NOT the right way to check for String
        System.out.println(name.equals(name2)); //Correct way


    }
}
