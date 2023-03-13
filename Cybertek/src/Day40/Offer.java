package Day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the
     * information about offer object
     */

    //inside instance method we can directly access instance variable
    public void displayInfo(){
        System.out.println(location+" "+company+" "+salary
                +" "+isFullTime);
    }

    //Write a method called turnToFullTime
    public void turnToFullTime(){
        if(isFullTime == false){
            isFullTime = true;
        }else{
            System.out.println("ALREADY FULL TIME");
        }

    }
    //Write a method to change the location of the offer
    //to the location user passed
    public void changeLocation(String newLocation){
        location = newLocation;


    }
    //Write a method to accept 4 parameters to change all info
    //about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){

        company= newCompany ;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        //an instance method can call another instance method
        //an instance method can use any instance fields
        //since we already have functionality to display info
        //we called it here to display new information after modifying
        displayInfo();


    }

    //write a method to check if the offer is 100k club and return the result as true false

    /**
     * a method to check if the offer is 100k club
     * @return true if the salary is more than 100k, false if not
     */
    public boolean is100KOffer(){
        //salary>=100000 already generate a boolean result
        //so we can directly return that result
        return salary>=100000;

    }

    /**
     * Create an instance method called toString
     * has no parameter
     * @param
     * @return String representation of Offer object
     * In below format
     * [location = virgina, company = Amazon | salary = 150000 |isFullTime = true]
     */
    public String toString(){
        String str = "["+location+" "+company+" "+salary
                +" "+isFullTime+"]";

        return str;
    }





}
