package Day12;

public class FizzBuzzTest {

    public static void main(String[] args) {

        int num = 15;
        if(num%3 == 0 & num%5 == 0){
            System.out.println("FizzBuzz Number");
        }else if (num%3 == 0){
            System.out.println("BuzzNumber");
        }
        else if (num%5 == 0){
            System.out.println("FizzNumber");
        }else{
            System.out.println("NOT my number");
        }

    }
}
