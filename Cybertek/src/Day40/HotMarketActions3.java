package Day40;

public class HotMarketActions3 {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.company = "Apple";
        offer1.location ="Austin";
        offer1.isFullTime = false;
        offer1.salary = 140000;

        offer1.displayInfo();
        offer1.turnToFullTime();
        offer1.turnToFullTime();
        offer1.changeLocation("DC");
        offer1.displayInfo();

        offer1.changeAllInfo("Amazon","Virgina",150000,true);
        //offer1.displayInfo();

        //if this guy earn more than 100k
        //move him to Atlanta
        System.out.println("is it 100k offer?--> "+offer1.is100KOffer());
//        boolean result = offer1.is100KOffer();
//        if (result==true){
        if (offer1.is100KOffer()){
            offer1.changeLocation("Atlanta");
        }
        offer1.displayInfo();



    }
}
