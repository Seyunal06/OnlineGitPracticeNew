package Day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain {
    //if you are sure the method will never actually throw the exception
    //its good to declare
    public static void main(String[] args) throws InterruptedException{


        //we declared it
        System.out.println("the start");
            try{
                readMyFile();
            }catch (FileNotFoundException e){
                System.out.println("Handling here");
            }
            Thread.sleep(3000);
        System.out.println("the end");




    }
    public static void readMyFile() throws FileNotFoundException {
        System.out.println("reading the file in my computer");
        throw new FileNotFoundException("Kaboom! file is not here!!");
    }
}
