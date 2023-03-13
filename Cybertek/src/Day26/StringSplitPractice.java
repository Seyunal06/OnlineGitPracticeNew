package Day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan, Susan";

        students = students.replace(" ","");
        System.out.println("Students = " + students);

        String[] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("length --> " + namesArrays.length);

        int studentCount = namesArrays.length;

        for (int x = 0; x < studentCount; x++) {

            String name = namesArrays[x];

            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i)+"-");
            }
            System.out.println();
        }


//        String name = namesArrays[0];//Abbos
//
//        for (int i = 0; i < name.length(); i++) {
//            System.out.print(name.charAt(i)+"-");
//        }
//
//        String name1 = namesArrays[1];
//
//        System.out.println();
//        for (int i = 0; i < name1.length(); i++) {
//            System.out.print(name1.charAt(i)+"-");
//        }
//
//        String name2 = namesArrays[2];
//
//        System.out.println();
//        for (int i = 0; i < name2.length(); i++) {
//            System.out.print(name2.charAt(i)+"-");
//        }

    }
}
