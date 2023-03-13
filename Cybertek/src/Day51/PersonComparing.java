package Day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {

        Person p1 = new Person("Seyma",23);
        Person p2 = new Person("Marcos",24);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println(p1.compareTo(p2));

        int result = p2.compareTo(new Person("Unal",30));

        System.out.println("result = " + result);

//        //print out the name of the older person
//        if (p1.compareTo(p2)==1){
//            System.out.println(p2.name);
//        }else{
//            System.out.println(p1.name);
//        }
        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(new Person("Unal",30));
        System.out.println("lst = " + lst);

        //Anything we sort must be a type of comparable
        Collections.sort(lst);
        System.out.println("lst = " + lst);


        //compare p1 and p2 by age
        //if p1 has older print 1
        //if they are same age print 0
        //if p2 is older print -1

//        if (p1.age > p2.age){
//            System.out.println(1);
//        }else if (p1.age < p2.age){
//            System.out.println(-1);
//        }else{
//            System.out.println(0);
//        }

    }
}
