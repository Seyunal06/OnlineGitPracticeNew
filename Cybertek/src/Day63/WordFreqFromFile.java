package Day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WordFreqFromFile {
    public static void main(String[] args) {


        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/Day63/map.txt"));
            System.out.println(allLines);

            String allLinesAsString = allLines.toString();

            Map<String, Integer> map = WordUtil.getFreqMap(allLinesAsString);
            System.out.println("Map: "+map);

        }catch (IOException e){
            System.out.println("ERROR");
        }

    }
}
