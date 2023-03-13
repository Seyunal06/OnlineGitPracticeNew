package Day40;

public class HotMarketActions4 {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.company = "Apple";
        offer1.location ="Austin";
        offer1.isFullTime = true;
        offer1.salary = 140000;

        //two ways of calling it
        String offer1Str = offer1.toString();
        System.out.println(offer1Str);

        System.out.println(offer1.toString());
        //if you directly print out object, it will call toString() method automatically
        System.out.println(offer1);// this is what is automatically happening behind the scene offer1.toString()


        Offer offer2 = new Offer();
        offer2.company = "Google";
        offer2.location = "Boston";
        offer2.isFullTime = true;
        offer2.salary = 100000;


        Offer offer3 = new Offer();
        offer3.company = "Amazon";
        offer3.location = "Vancouver";
        offer3.isFullTime = true;
        offer3.salary = 96000;


        Offer offer4 = new Offer();










    }
}
