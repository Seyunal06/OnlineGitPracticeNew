package Day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        //List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>();
        lst.add("Seyma");
        lst.add("Unal");
        lst.add("Marcos");
        lst.add("Gonzalez");

        System.out.println(lst);

        lst.remove("Unal");
        System.out.println(lst);

    }
}
