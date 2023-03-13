package Day34;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        add(15);
        add(15,45);
        add(15,43,67);
        add(15l,23l);
    }

    private static void add(int i) {
       // System.out.println(i + 100 + " add int i");
        add(i,100);//we can do this to reuse functionality we already have
    }
    private static void add(int a, int b) {
        System.out.println(a+b + " add int a and int b");
    }
    private static void add(int c, int d, int e) {
        System.out.println(c+d+e + " add int c and int d and int e");
    }
    private static void add(long i, long x) {
        System.out.println(i+x + " add long i and long x");
    }

}
