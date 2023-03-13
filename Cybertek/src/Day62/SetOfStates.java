package Day62;


import java.util.*;


public class SetOfStates {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        //all Collection type has addAll method
        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL"));

        //any type of collection has size method to count the item
        System.out.println("how many? states size "+states.size());


        for (String each: states){
            System.out.println(each);
        }
        //For loop does not work, no index
        //we can use iterator for any type of collection at anytime


        //creating iterator
//        Iterator<String> stIter = states.iterator();
//
//        while (stIter.hasNext()){
//            System.out.println("stIter = " + stIter.next());
//        }

        //Lambda expression
        states.forEach(each -> System.out.println("each state = " +each));

    }
}
