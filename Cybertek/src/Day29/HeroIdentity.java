package Day29;

public class HeroIdentity {
    public static void main(String[] args) {

        //EXTREME LITTLE CODE
        String hero = "Superman-Clark J Kent";
        //hide this hero identity
        //String heroX = "Superman-**************";

        //String[] heroSplit = hero.split("-");
       // String heroCode = heroSplit[0];
       // String fullName = heroSplit[1];

        String stars = "";
        for (int i = 0; i < hero.split("-")[1].length(); i++)
            stars +="*";

       // System.out.println(heroSplit[1]);
        //System.out.println(stars);
        //String heroX = hero.replace(heroSplit[1],stars);
        System.out.println("hero = " +hero);
        System.out.println("heroX = " + hero.replace(hero.split("-")[1],stars));





    }
}
