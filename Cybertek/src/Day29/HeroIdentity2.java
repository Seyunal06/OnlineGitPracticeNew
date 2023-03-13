package Day29;

public class HeroIdentity2 {
    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark J Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
               "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeroes) {
            //System.out.println(eachHero);

            String hero = eachHero;
            //hide this hero identity
            //String heroX = "Superman-**************";

            String[] heroSplit = hero.split("-");
            String heroCode = heroSplit[0];
            String fullName = heroSplit[1];

            String stars = "";
            for (int i = 0; i < hero.split("-")[1].length(); i++) {
                stars += "*";
            }
            String heroX = hero.replace(fullName, stars);
            System.out.println(hero);
            System.out.println(heroX);
        }
    }
}
