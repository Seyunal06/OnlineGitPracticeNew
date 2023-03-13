package Day62;

import Day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        SortedSet<Job> jobs = new TreeSet<>();

        jobs.add(new Job("FL", 120000,"AT&T"));
        jobs.add(new Job("LA", 130000,"BBC"));
        jobs.add(new Job("TX", 150000,"Apple"));
        jobs.add(new Job("CA", 100000,"Amazon"));
        jobs.add(new Job("VA", 110000,"USPTO"));

        for (Job each : jobs){
            System.out.println(each);
        }


    }
}
