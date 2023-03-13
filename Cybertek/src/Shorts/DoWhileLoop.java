package Shorts;

public class DoWhileLoop {
    public static void main(String[] args) {
//        int apples = 1;
//
//        do{
//            System.out.println("Eating an apple - " + apples);
//            apples++;
//        }while (apples <= 10);

        int number = 1;
        int until = 10;

        do {
            System.out.print(number+ ", ");
            number++; // you can also have your update in the
                      //while (++number)
        }while (number <= until);

//      this is how to do a reverse
//        int number = 1;
//        int until = 10;
//
//        do {
//            System.out.print(until + ", ");
//            until--;
//        }while (until >= number);

//        int num = 5;
//
//        do {
//            System.out.println("&");
//            num--;
//        }while (num >= 1);

    }
}
