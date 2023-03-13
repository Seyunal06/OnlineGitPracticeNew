package Day35;

public class WrapperTypePrimitiveConversion {
    public static void main(String[] args) {


        Integer num1 = 100; //auto-boxing

        //it returns an Integer object by Wrapping up the number
        int num2 = Integer.valueOf("200"); //auto-unboxing into 200

        //This is how we can use parseInt to convert String to int
        int num3 = Integer.parseInt("200");
        //it returns an int value converted from String
        //YOU CAN USE WHICHEVER YOU WANT

//        String caseNum = "IPR2012-00001";
//        int year; //--get 2012 out of it
//
//        String strYear = caseNum.substring(3,7);
//        year = Integer.parseInt(strYear);
//        System.out.println("the year--> "+strYear);

        System.out.println(getYear("DER2019-00034"));
        System.out.println(getYear("IPR2009-01042"));
        System.out.println(getYear("CBM2001-10133"));

    }
    public static int getYear(String caseNum){
        //do validation on case number
        //TODO : Case number should always start with either
        //CBM, IPR, PGR, DER
        //FOLLOWED BY 4 DIGIT NUMBER
        //FOLLOWED BY DASH -
        //AND FOLLOWED BY 5 DIGITS


//        int year; //--get 2012 out of it
//        String strYear = caseNum.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;
        return Integer.parseInt(caseNum.substring(3,7));//ONE SHOT
    }
}
