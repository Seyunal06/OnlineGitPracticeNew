package Day29;

import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {

        String hero = "Superman-Clark J Kent";

        String[] heroSplit = hero.split("-");
        System.out.println("split= " + Arrays.toString(heroSplit));
        //to make it more obvious-->
        String heroCode = heroSplit[0];
        String identity = heroSplit[1];


        System.out.println("hero is "+heroSplit[0]+" _identity is "+heroSplit[1]);
        System.out.println("hero is "+heroCode+" _identity is "+identity);

        System.out.println("==============================");

        String[] identitySplit = identity.split(" ");
        System.out.println(Arrays.toString(identitySplit));
        String lastName = identitySplit[identitySplit.length-1];
        System.out.println("last name " + lastName);
        System.out.println("Initial of the hero is: " + identity.charAt(0) + lastName.charAt(0));













    }
}
