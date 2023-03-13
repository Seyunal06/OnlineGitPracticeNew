package Day32;

public class NumberAction {
    public static void main(String[] args) {

        repeatString("Java",3);
        repeatString("Do not touch working code",10);
        skipCountBy3();
        countDownXToY(10,6);
        countDown50();

    }
    public static void numberComparison(int num1, int num2){
        if (num1>num2){
            System.out.println("num1 is more than num2");
        }else if (num2>num1){
            System.out.println("num2 is more than num1");
        }else {
            System.out.println("they are equal");
        }
    }
    public static void print1ToX(int x){
        for (int i=1; i<= x; i++){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void countDown50(){
//        for (int i = 50; i>=0; i--){
//            if(i%2==0){
//                System.out.println(i+ " ");
//            }
//        }
//        System.out.println();
        countDownXToY(50,0);

    }
    public static void countDownXToY(int x, int y){
        for (int i = x; i>= y; i--){
            if(i% 2 ==0){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void skipCountBy3(){
        for (int i= 0; i< 50;i+=3){
            System.out.println(i+" ");
        }
        System.out.println();
    }
    public static void repeatString(String strRepeat, int count){
        for (int i = 1; i <= count; i++){
            System.out.println(strRepeat+ " ");
        }
    }
}
