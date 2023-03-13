package Day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        //             012345678901234567890123456789012
        String name = "I love Java I love Java Java Java";

        System.out.println("Starting from 0 " + name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 7));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 9));
        System.out.println(name.indexOf("Java", 19));
        System.out.println(name.indexOf("Java", 20));

        int firstJava = name.indexOf("Java");
        int searchFor = firstJava + 1;
        int secondJava = name.indexOf("Java", searchFor);
        System.out.println("secondJava = " + secondJava);
        
        searchFor = secondJava + 1;
        int thirdJava = name.indexOf("Java", searchFor);
        System.out.println("thirdJava = " + thirdJava);
        searchFor = thirdJava + 1;
        int forthJava = name.indexOf("Java", searchFor);
        System.out.println("forthJava = " + forthJava);


    }
}
