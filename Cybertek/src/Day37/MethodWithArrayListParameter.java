package Day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {

        //List is smaller than ArrayList
        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Seyma");
        nameLst.add("Unal");
        nameLst.add("Marcos");
        nameLst.add("Gonzalez");

        printAList(nameLst);

        String resultLong = getLongestElement(nameLst);
        System.out.println("longest result "+resultLong);


        //this doesn't work bc its a bigger data type
//        byte myByte = 17;
//        printByte(myByte);
//
//        int myInt = 100;
//        printByte(myInt);

    }
    public static String getLongestElement(List<String> nameLst){

        String longestName= nameLst.get(0);

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName= nameLst.get(x);

            //> will give you first longest name if you have more than one
            //>= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length() ){
                longestName = currentName;
            }
        }
        return longestName;
    }



    /**
     * This method will print out the content of passed List
     * @param lst of String
     * @return nothing
     */
    public static void printAList(ArrayList<String> lst){

        for (String each: lst){
            System.out.println(each);
        }
    }
    /**
     * A simple method to print a byte value passed
     * @param b
     */
    public static void printByte (byte b){
        System.out.println("you passed byte value = "+ b);
    }


}
