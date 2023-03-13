package Day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {
    public static void main(String[] args) {


        //List<String> names = new ArrayList<>();
        Collection<String> names = new ArrayList<>();

        names.add("Seyma");
        names.add("Unal");
        names.add("Marcos");
        names.add("Gonzalez");
        names.addAll(names);//addAll method parameter type is Collection (interface) so we can pass anything Is-A Collection

        names.removeAll(Arrays.asList("Unal"));

        Collection<String> toRemoveLst= Arrays.asList("Gonzalez");
        names.removeAll(toRemoveLst);
        System.out.println("names = " + names);

        for (String eachName: names) {
            System.out.println("EachName= "+eachName);
        }

        //OPTIONALLY: this is how we can use forEach method to print out everything in one shot
        names.forEach(each -> System.out.println("each = " + each));






    }
}

/*
* The word Collection everywhere:
*
* Collection Framework--> referring entire things, entire topic
*
* Collection Interface--> one interface under the entire Collection Framework
*
* Collection class--> (it has s at the end just like Array and Arrays)
*                 --> is a utility class with many static methods
*                 for example : Collections.sort(your collection object1)
*
* */
