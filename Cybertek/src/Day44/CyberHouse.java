package Day44;

public class CyberHouse {

    String design;
    int houseNum;
    //we can change default value of the field
    //by assigning value directly in the template class
    private static String neighborhood = "Cybertek Ave";

    //constructor can access anything
    public CyberHouse(String design,int houseNum){
        this.design = design;
        this.houseNum= houseNum;
    }
    public void showAllInfo(){
        System.out.println("house--> "+this.houseNum+
                " design--> "+this.design+
                " neighborhood-->"+neighborhood);
    }
    //static method can only access static members of same class
    public static void showNeighborhoodName(){
        System.out.println("neighborhood = " + neighborhood);
        //CANNOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        //System.out.println(houseNum);
    }

















}
