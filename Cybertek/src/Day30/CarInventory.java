package Day30;

public class CarInventory {
    public static void main(String[] args) {

        String[] cars = {"Acura-NSX",
        "Chevrolet-Corvette",
        "Chevrolet-Cavalier",
        "Bmw-3 Series",
        "Pontiac-LeMans",
        "BMW-7 Series",
        "Oldsmobile-Achieva",
        "Honda-Civic"};

        int chevyCount =0;
        int civicCount =0;

        for (String eachCar:cars) {

            if (eachCar.toLowerCase().startsWith("chevrolet")){
                chevyCount++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                civicCount++;
            }

        }
        System.out.println(chevyCount);
        System.out.println(civicCount);










    }

}
