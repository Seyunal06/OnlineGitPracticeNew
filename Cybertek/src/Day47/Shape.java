package Day47;

public abstract class Shape {

    String name;
    int area;

    public Shape(String name){
        this.name=name;
    }
    public abstract void calculateArea();

    public abstract String toString();



    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }









}
