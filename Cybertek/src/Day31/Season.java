package Day31;

public class Season {
    public static void main(String[] args) {

        String mySeason = "winter";
        decideSeason("spring");
        decideSeason("summer");
        decideSeason(mySeason);
    }
    public static void decideSeason(String season){

        switch (season){
            case "summer" :
                System.out.println("Swimming");
                break;
            case "fall":
                System.out.println("Leaves");
                break;
            case "winter":
                System.out.println("Snow");
                break;
            case "spring":
                System.out.println("Bunny");
                break;
            default:
                System.out.println("Invalid season");
        }
    }
}
