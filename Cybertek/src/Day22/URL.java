package Day22;

public class URL {
    public static void main(String[] args) {

        String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "This will lead you to today";

//        for (int moduleNum = 3317; moduleNum <= 3317+25 ; moduleNum++) {
//            System.out.println(moduleNum);
//        }

        for(int day = 21; day <= 56; day++){
            System.out.println(dayMsg + day);
            System.out.println(baseURL+ (3296 + day));
        }
    }
}
