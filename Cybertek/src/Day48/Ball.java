package Day48;

public class Ball implements Bouncible{

    String shape;
    String color;

    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }
    @Override
    public String toString(){
        return "shape = "+shape +" and " +
                "color = "+color;
    }
    @Override
    public void bounce() {
        System.out.println(color + " ball with " + shape +
                " shape is bouncing if gravity is " + GRAVITY);
    }
}
