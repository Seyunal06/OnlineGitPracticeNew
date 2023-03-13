package Day52.Polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {

         //Circle c1 = new Circle("penny",5);
        // Shape c1 = new Circle("penny",5);
        Object c1 = new Circle("penny",5);
        //Drawable c1 = new Circle("penny",5);

        //ONLY THE REFERENCE TYPE CAN DECIDE WHAT YOU CAN ACCESS
        //WITH THAT VARIABLE
        //c1.draw();

        System.out.println(c1.toString());

        //how do I know what is the actual object type
        System.out.println(c1.getClass().getSimpleName());


    }
    public static void printAnyShapeArea(Shape anyShape){

    }
}
