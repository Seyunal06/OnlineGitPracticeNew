package Day37;

import java.util.ArrayList;

public class ArrayListLoopPractice {
    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Seyma");
        nameLst.add("Unal");
        nameLst.add("Marcos");
        nameLst.add("Gonzalez");
        nameLst.add("Qonzalez");
        nameLst.add("Potato");
        nameLst.add("Banana");

        System.out.println(nameLst);

        //Assume the first one is the longest than compare with the rest
        String longestName= nameLst.get(0);

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName= nameLst.get(x);

            //> will give you first longest name if you have more than one
            //>= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length() ){
                longestName = currentName;
            }
        }
        System.out.println(longestName);

        for (int i = 0; i < nameLst.size(); i++) {
            if (nameLst.get(i).length()== longestName.length()){
                System.out.println("Longest words = "+nameLst.get(i));
            }
        }


        //length :counting the elements inside array, its a property of an array object
                 //last element of an array : arr[arr.length-1]
        //length() :counting the characters inside String, its a method of String object
                 //last char of a String : str.charAt(str.length()-1)
        //size() :counting the elements inside ArrayList object, its a method of List Object
                 //last element of an arrayList : lst.get(lst.size()-1)


        //HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEM
        System.out.println("----------------------------------");
        for (String currentName:nameLst){
            System.out.println(currentName);
        }





    }
}
