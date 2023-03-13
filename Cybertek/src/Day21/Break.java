package Day21;

public class Break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            if(i ==5){
                break;
            }
        }

        int sum = 0;

        for(int x = 1; x <= 10; x++){
            sum = sum + x;

            if(sum + x > 40){ // its very important what you have inside
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
