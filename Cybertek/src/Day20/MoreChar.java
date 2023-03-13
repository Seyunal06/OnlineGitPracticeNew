package Day20;

public class MoreChar {
    public static void main(String[] args) {

        //             012345
        String name = "Seymas";
        int charCount = name.length();
        int lastCharIndex = charCount -1;// also can be used this way

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));

//        int x = 0;
//
//        System.out.println(name.substring(x,x+2));
//        x = x + 2;
//        System.out.println(name.substring(x,x+2));
//        x = x + 2;
//        System.out.println(name.substring(x,x+2));
//        x = x + 2;

        for(int x = 0; x <= charCount -2; x+=2){
            System.out.println(name.substring(x,x+2));
        }
    }
}
