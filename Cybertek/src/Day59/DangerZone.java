package Day59;

import java.io.IOException;

public class DangerZone {
    public static void main(String[] args) {//throws IOException {


        try {
            playWFire();
        } catch (IOException e) {
            System.out.println("go here if you get burned");
        }


    }
    //this is a method that declares, it might throw a checked exception IOException
    //whoever calls it, handle the consequences themselves
    public static void playWFire()throws IOException {
        System.out.println("some consequences might happen");
        throw new IOException("now you will get burned");
    }
}
