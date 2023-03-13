package Day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {
    public static void main(String[] args) {

       // ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("liz");
        teamMates.add("Penny");
        teamMates.add("Mary");
        teamMates.add("Lily");
        teamMates.add("Susan");
        teamMates.add("Ali");
        teamMates.add("Hatice");
        teamMates.add("Fatih");
        teamMates.add("Busra");
        teamMates.add("Lola");


        System.out.println(teamMates);

        System.out.println(teamMates.get(0)+" and "+ teamMates.get(teamMates.size()-1));

        for (int x = 0; x < teamMates.size(); x++) {

            //counting the index
            System.out.println((x+1) +" "+teamMates.get(x));

        }

        System.out.println("\n------Reverse way-----");
        for (int x = teamMates.size()-1; x > 0; x--) {

            System.out.println(teamMates.get(x));

        }
        //print 2 items at a time
        //for example: 1-2, 2-3, 3-4, 4-5 ......
        System.out.println("------print two items at a time-----");
        for (int x = 0; x <= teamMates.size()-2; x++) {

            System.out.println(teamMates.get(x)+ " " +teamMates.get(x+1));
        }

        //print 2 items at a time
        //for example: 1-2, 3-4, 5-6, 7-8 ......
        System.out.println("------print two items at a time without repeating-----");
        for (int x = 0; x <= teamMates.size()-2; x+=2) {

            System.out.println(teamMates.get(x)+ " " +teamMates.get(x+1));
        }


        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {

            result += teamMates.get(i)+ "-";
        }
        System.out.println(result);

        String lstToString = teamMates.toString();
        System.out.println(lstToString.replace(", ","-").replace("[","").replace("]",""));









    }
}
