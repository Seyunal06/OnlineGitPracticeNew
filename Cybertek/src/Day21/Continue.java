package Day21;

public class Continue {
    public static void main(String[] args) {

        for(int x = 1; x <= 10; x++){

            if(x % 2 ==1){
                continue; // continue ONLY if its an even number
            }
            System.out.println(x);
        }
    }
}
