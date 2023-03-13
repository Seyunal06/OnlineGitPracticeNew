package Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");//when we remove Cyborg, Flash becomes the item at index 2
        superHeroes.add("Aquaman");
        superHeroes.add("Flash");
        superHeroes.add("Wonder Woman");

        System.out.println(superHeroes);

        //Do we have superman in the list?
        System.out.println(superHeroes.contains("Superman"));

        System.out.println(superHeroes.contains("man"));


        //remove the heroes that dont have man in the name
        for (int x = 0; x < superHeroes.size(); x++) {

            String currentHero = superHeroes.get(x);
            if (!currentHero.contains("man")){
                superHeroes.remove(currentHero);
                //once hero is removed, this index will be filled by next item
                //so we need to decrease the index by 1 so we stay at the same index
                --x;//once item is removed, it will decrease the index to stay at the same index in the next iteration
            }
        }
        System.out.println(superHeroes);

        //take away from here:
        // while removing item during the for loop
        //when you remove 1 item, you will have one less item in the list
        //everything after the removed item will move to one index to the left
        //so in order not to miss the item right after the removed item
        //we need to decrease the index by one to stay at the same index after removing


        List<String> superHeroCopy = new ArrayList<>(superHeroes);
        System.out.println("copy version --> "+superHeroCopy);

        //THIS WILL CREATE AN UNMODIFIABLE LIST!!
        List<String>topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println(topics);

        //COPYING EVERYTHING inside topic to topicCopy
        //And its just regular ArrayList, we can do anything with it!!!
        List<String>topicsCopy = new ArrayList<>(topics);
        System.out.println("copy version --> "+topicsCopy);



    }
}
