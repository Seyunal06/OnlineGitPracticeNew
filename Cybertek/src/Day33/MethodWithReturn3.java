package Day33;

public class MethodWithReturn3 {
    public static void main(String[] args) {

        System.out.println(returnAge(1999));


    }
    public static int returnAge(int birthYear){
        if (birthYear <= 1900 || birthYear >= 2020){
            return 0;
        }
        // if I get here, it means the birth year is valid

        return 2019- birthYear;


    }



}
