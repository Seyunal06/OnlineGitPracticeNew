package Day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/Day63/employeeData.txt"));

        for (String eachLine: allData) {
            System.out.println(eachLine);
        }
        String line = "";
        int id = Integer.parseInt(line.split(" ")[0]);
        String name = line.split(" ")[1];



        Map<Integer,String> idNamePair = new HashMap<>();
        idNamePair.put(id,name);
        System.out.println(idNamePair);





        //lambda
        //allData.forEach(eachLine -> System.out.println(eachLine));

    }
}
