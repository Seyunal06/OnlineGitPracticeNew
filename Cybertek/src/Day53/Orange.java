package Day53;

public class Orange extends Fruit {

    int vitaminC;

    public Orange(String taste, String color, int vitaminC) {
        super(taste, color);
        this.vitaminC=vitaminC;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange with vitamin C level "+vitaminC
        +" has color "+color
        +" and it has " +taste+" taste when you digest");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitaminC=" + vitaminC +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
