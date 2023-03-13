package Day14;

public class IndexOf {
    public static void main(String[] args) {

        //             012345678901
        String name = "Game of Java";

        // finding the location .indexOf
        System.out.println(name.indexOf("Java"));

        System.out.println(name.indexOf("o"));

        System.out.println(name.indexOf(" "));

        System.out.println(name.lastIndexOf("a"));
    }
}
