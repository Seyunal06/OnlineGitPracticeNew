package Shorts;

public class TernaryOperator {
    public static void main(String[] args) {

        int n1 = 77;
        int n2 = 6;
        int max;

//        if(n1>n2){
//            max = n1;
//        }else{
//            max = n2;
//        }

        max = (n1>n2) ? n1 : n2;

        System.out.println(max);

        int bill = 2400;
        //                      if yes 15  if no 10
        int discount = (bill > 2000) ? 15 : 10;
        System.out.println(discount);
    }
}
