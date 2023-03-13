package Day40;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class HotMarketActions {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.company = "Apple";
        offer1.location ="Austin";
        offer1.isFullTime = true;
        offer1.salary = 140000;
        offer1.displayInfo();

        Offer offer2 = new Offer();
        offer2.company = "Google";
        offer2.location = "Boston";
        offer2.isFullTime = true;
        offer2.salary = 100000;
        offer2.displayInfo();

        Offer offer3 = new Offer();
        offer3.company = "Amazon";
        offer3.location = "Vancouver";
        offer3.isFullTime = true;
        offer3.salary = 96000;
        offer3.displayInfo();

        Offer offer4 = new Offer();
        //If we dont assign values for instance field/variable
        //we get default value
        //for primitive numbers: 0
                //boolean:false
                //char   : ''
        //for any reference types:
            //null
        offer4.displayInfo();

        System.out.println("ArrayList part----------------------");
        ArrayList<Offer> myOffers = new ArrayList<>();
        //Creating ArrayList of offer to store multiple offer objects
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);

        System.out.println(myOffers);

        System.out.println("for each loop----------------------");
        for (Offer each:myOffers) {
            each.displayInfo();
        }

        System.out.println("for loop---------------------------");
        for (int i = 0; i < myOffers.size(); i++) {
            //store each item to a variable each
            Offer each = myOffers.get(i);
            each.displayInfo();

            //one shot
            // myOffers.get(i).displayInfo();

        }



    }
}
