package Day33;

public class MethodWithReturn2 {
    public static void main(String[] args) {
        //Todo 1, Call your method here to test

        System.out.println(dayOfTheWeek(6));
        System.out.println(dayOfTheWeek(18));

        int[] allCodes = {5,3,11,4,33};

        for (int x = 0; x < allCodes.length; x++) {
            String day = dayOfTheWeek(allCodes[x]);
            System.out.println("Dayyy "+day);

        }
        System.out.println("------------------");
        for (int eachDay: allCodes){
            System.out.println(dayOfTheWeek(eachDay));
        }

    }

    public static String dayOfTheWeek(int dayCode){

        String dayName="";

        switch (dayCode){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Loser";
        }
        return dayName;
    }
}
