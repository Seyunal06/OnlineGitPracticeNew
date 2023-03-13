package Day54;

public class Utility {

    public static void main(String[] args) {


        Wearable w2 = new Clothes();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        Wearable w5 = new Makeups();
        wearMyWearable(w5);

        //directly passing the object without storing into a variable
        wearMyWearable(new Watch());

        System.out.println("calling the getMyWearableObject");
       Wearable result = getMyWearableObject();

      String result1 = getMyString();
        System.out.println("result1 = " + result1);

        System.out.println(result.getClass().getSimpleName());




    }

    public static String getMyString(){
//        String str = new String("bla bla");
//        return str;

        return new String ("bla bla");
    }

    // create a static method called getMyWearable
    //it returns a Wearable object (or anything IS-A Wearable)

    public static Wearable getMyWearableObject(){
        //Wearable w = new Clothes();
        //return w;

//        return new Clothes() ;
//        return new Watch() ;
//        return new Perfume() ;
        return new Makeups() ;
    }

    //it has 1 parameter with type Wearable
    //made it static so we can just call it directly
    public static void wearMyWearable (Wearable any){

        any.wear();


    }




}
