package Day61;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {
    public static void main(String[] args) {


        Job j1 = new Job("GA",120000,"BOFA");
        Job j2 = new Job("VA",110000,"Amazon");

        System.out.println(j1.compareTo(j2));


        List<Job> myFavJobs = new LinkedList<>();
        myFavJobs.add(new Job("GA",120000,"BOFA"));
        myFavJobs.add(new Job("VA",110000,"Amazon"));
        myFavJobs.add(new Job("NY",140000,"FaceBook"));
        myFavJobs.add(new Job("CA",150000,"Apple"));
        myFavJobs.add(new Job("WA",145000,"Microsoft"));

        //it sorts by using the compare method
        Collections.sort(myFavJobs);
        System.out.println(myFavJobs);

        Collections.sort(myFavJobs, Comparator.reverseOrder());
        System.out.println(myFavJobs);


    }
}
