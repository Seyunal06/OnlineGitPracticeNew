package Day52.Polymorphism;

public abstract class Shape implements Drawable {
    String name;
    double area;


    //why abstract must have constructor even when we cant
    // create an object? it exists to let sub class call and reuse
    // the functionality in sub class constructor
    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();
    //inherited
    //void draw();



















}
