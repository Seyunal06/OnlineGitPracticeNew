package Day31;

public class Method3 {

    public static void countDown() {

        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printOddTo100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        }
        public static void main (String[]args){
            countDown();
            printOddTo100();
        }
}
