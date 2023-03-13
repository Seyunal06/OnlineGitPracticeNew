package Day27;

import java.util.Arrays;

public class MultiDimArrPractice {
    public static void main(String[] args) {

        String[] developers = {"tom", "bob", "ted", "seyma"};
        String[] testers = {"sid", "mia", "nia"};
        String[] businessAnalyses = {"tedd", "dan", "lisa"};

        String[][] scrumTeam = {developers, testers, businessAnalyses};

        int maxLength = scrumTeam[0][0].length();
        String longestName = "";// to store longest String

        for (String[] each1DArray : scrumTeam){
            for (String eachElement : each1DArray){
                if (maxLength < eachElement.length()){
                    maxLength = eachElement.length();
                    longestName = eachElement;
                }
            }
        }
        System.out.println(longestName);
        //NESTED LOOP
//        for (String[] each1DArray : scrumTeam){
//            for (String eachElement : each1DArray){
//
//                if (maxLength == eachElement.length()){
//                    System.out.println(eachElement);
//                }
//            }
//        }

    }
}
