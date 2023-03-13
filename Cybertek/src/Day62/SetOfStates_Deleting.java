package Day62;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetOfStates_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        //all Collection type has addAll method
        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL"));

//        states.remove("GA");
       System.out.println("before "+states);

       //The Lambda expression way of removing
       states.removeIf(each -> each.contains("A"));
        System.out.println("states after "+ states);

        //remove all the states with letter A
        //Iterator<String> stIter = states.iterator();
        //iterator has 3 methods hasNext() next() remove() works together

//        while (stIter.hasNext()){
//
//            String each = stIter.next();
//            if (each.contains("A")){
//                System.out.println("removing "+each);
//                stIter.remove();
//            }
//        }
//        System.out.println("after "+states);



    }
}
