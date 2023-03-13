package Day51.Polymorphisim;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        System.out.println("ArrayList part----------------------------");
        Shape[] allShapes ={s1,s2,s3, new Triangle(),s2};

        for (Shape each :allShapes){
            each.draw();
        }
        System.out.println("----------------------------");
        for (int x=0; x<allShapes.length;x++){
            allShapes[x].draw();
        }
        System.out.println("List part----------------------------");
        List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);

        for (Shape each:shapeList){
            each.draw();
        }
        System.out.println("----------------------------");
        for (int x=0;x<shapeList.size();x++){
            shapeList.get(x).draw();
        }


    }

}
