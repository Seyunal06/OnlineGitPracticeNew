package Day47;

public class Rectangle extends Shape {

    int width;
    int height;
    public Rectangle(int width, int height){
        //I want to set the name to the word rectangle
        //I am reusing the functionality of super class
        //to set the name to rectangle
        super("rectangle");
        this.height= height;
        this.width = width;
    }
    @Override
    public void calculateArea(){
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
