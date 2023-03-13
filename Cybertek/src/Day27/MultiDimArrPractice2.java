package Day27;

public class MultiDimArrPractice2 {
    public static void main(String[] args) {



        String[] developers = {"tom", "bob", "ted", "seyma"};
        String[] testers = {"jz", "mia", "nia"};
        String[] businessAnalyses = {"tedd", "dan", "lisa"};

        String[][] scrumTeam = {developers, testers, businessAnalyses};

        int smallLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int x = 0; x< scrumTeam.length;x++){
            //System.out.println(Arrays.toString(scrumTeam[x]));
            for (int i=0;i<scrumTeam[x].length;i++){
                //System.out.println(scrumTeam[x][i]);
                if (smallLength > scrumTeam[x][i].length()){
                    smallLength = scrumTeam[x][i].length();
                    shortestString = scrumTeam[x][i];
                    // System.out.println(maxLength);
                }
            }
        }
        System.out.println(shortestString);















    }
}
