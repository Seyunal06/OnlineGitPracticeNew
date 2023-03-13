package Day55;

public class Casting {
    public static void main(String[] args) {

        int x = 10;

        long y = x;//it works implicitly/automatically

        //byte b = x;

        byte b = (byte) x;//needs to be casted
        //polymorphism
        Object o = new Dog("Chihuahua");//this is upcasting from type Dog to Object
        //o.bark();
        //Dog d = new Dog("hlsdjsd"); this is a new Object
        Dog d = (Dog) o;//this is downcasting from type Object to Dog
        d.bark();

        //in order to let the Dog object bark, we need to refer a dog as a Dog or we dont have access to Dog only action

        //WHEN DOES CLASS CAST EXCEPTION HAPPEN
        //when we try to cast supertype object into a subtype
        //or when the object type IS-NOT-A your casted reference type

        



    }
}
