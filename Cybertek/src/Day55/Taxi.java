package Day55;

public class Taxi {

    int plateNum;
    Engine eng;//just like String, we have class Engine
                //so I can use it as data type
    Driver dr;

    public Taxi(int plateNum, Engine eng, Driver dr) {
        this.plateNum = plateNum;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Num=" + plateNum +
                ", Engine=" + eng +
                ", Driver=" + dr +
                '}';
    }
}
class Driver{
    String name;
    int id;

    //constructor
    public Driver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

