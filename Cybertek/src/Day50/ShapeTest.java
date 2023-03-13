package Day50;

public class ShapeTest {
    public static void main(String[] args) {

        Square s1 = new Square("Bob", 10);
        System.out.println("s1 without calculating= " + s1);
        s1.calculateArea();
        System.out.println("s1 with calculating= " + s1);
        s1.draw();


    }
}
