package Day52.Polymorphism;

public class Square extends Shape {
//    String name;
//    double area;
    int length;

    public Square(String name, int length) {
        super(name);//reusing functionality of super class
        this.length= length;
    }


    @Override
    public void calculateArea() {
        area=length*length;//this is to calculate area of a square
    }
    @Override
    public void draw() {
        System.out.println("Draw 4 equal lines with 90 degree, length "
                + length+ " with color "+COLOR);//Drawable.COLOR
    }
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
