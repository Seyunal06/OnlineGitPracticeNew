package Day52.Polymorphism;

public class ShapePolymorphism2 {
    public static void main(String[] args) {

         //Circle c1 = new Circle("penny",5);
        Shape c1 = new Circle("penny",5);

        printAnyShapeArea(c1);
        Shape r1 = new Rectangle("book",10,5);
        printAnyShapeArea(r1);

        //we are directly passing the sub class object
        printAnyShapeArea(new Square("Bob",6));

        drawShape3Times(r1);
        drawShape3Times(c1);
        drawShape3Times(new Square("Bob",6));

    }
    public static void drawShape3Times(Shape anyShape){
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();

    }

    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name+"'s area is = "+anyShape.area);
    }


















}
