package Day48;

import java.util.List;

public class BouncingParty {

    public static void main(String[] args) {


        Kangaroo k1 = new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.carryingChild();
        k1.kickBox();

        //SuperType variableName = new SubType(...); THIS WORKS
        Bouncible k2 = new Kangaroo("toto",6);
        k2.bounce();

        Ball b1 = new Ball("round","red");
        System.out.println("b1 = " + b1);
        b1.bounce();



    }
}
