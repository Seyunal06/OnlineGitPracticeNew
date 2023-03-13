package Day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {

        //it returns List of String as each line as an element

        List<String> allLines = Files.readAllLines(Paths.get("src/Day60/hero.txt"));
        System.out.println("allLines = " + allLines);

        for (String eachLine : allLines){
            System.out.println(eachLine);
        }
    }
}
