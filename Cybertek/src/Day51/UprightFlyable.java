package Day51;

//Flyable is super type of UprightFlyable
//Flyable is more general, UprightFlyable is slightly less general but still abstract idea
public interface UprightFlyable extends Flyable{

    //void fly();
    void flyUpright();

}
