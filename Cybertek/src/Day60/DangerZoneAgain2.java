package Day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {
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
        try {
           throw new  FileNotFoundException("file is not here");
//            List<String> allLines =Files.readAllLines(Paths.get("hero.txt"));
//            System.out.println(allLines);
        }catch (FileNotFoundException e){
            System.out.println("Caught in readMyFile");
        }
    }
}
