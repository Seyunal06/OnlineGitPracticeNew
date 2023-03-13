package Day26;

public class ToCharArrayPracticeWithAllLoops {
    public static void main(String[] args) {

        String survey = "Complete B15 online 1 month Survey";
        char[] surveyChars = survey.toCharArray();

        System.out.println("for each loop ------");
        for (char each: surveyChars) {
            System.out.println(each);
        }
        System.out.println("for loop ------");
        for (int x = 0; x < surveyChars.length; x++) {
            System.out.println(surveyChars[x]);

        }

        System.out.println("while loop ------");
        int x = 0;
        while(x < surveyChars.length){

            System.out.println(surveyChars[x]);
            x++;
        }
        System.out.println("do while loop ------");
        int y = 0;
        do {
            System.out.println(surveyChars[y]);
            y++;
        }while (y < surveyChars.length);

    }
}
