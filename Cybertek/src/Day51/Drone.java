package Day51;

import java.util.List;

//a class implements a interface
//a interface extends a interface
//a class extends a class
public class Drone implements UprightFlyable{

    @Override
    public void flyUpright() {
        System.out.println("flying upright");
    }

    @Override
    public void fly() {
        System.out.println("flying regularly");
    }
}
