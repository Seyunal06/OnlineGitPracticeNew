package Day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {

    public static void main(String[] args) {

        Fruit f1= new Apple("sweet", "red","fuji");

        Fruit f2 = new Apple("crispy but tasteless","hot red","gala");

        Fruit f3 = new Orange("sour","orange",12);

        Fruit f4 = new Orange("very sweet","blood red",10);

        Fruit[] myFruit= {f1,f2,f3,f4};

        for (Fruit each : myFruit) {
            each.getDigested();
        }
        //in this way, its not resizable | adding or removing will not work
        //List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);
        //this is just a regular list with 4 items pre-filled
        List<Fruit>fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class type: "+each.getClass().getSimpleName());
        }

















    }

}
