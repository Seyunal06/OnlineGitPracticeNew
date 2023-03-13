package Day36;

public class MethodPractice {
    public static void main(String[] args) {

        //Boolean b = true; //auto boxed it to Boolean Object
        Boolean result = checkStringNumber("ytz13ck");
        System.out.println(result);

        Boolean result2 = checkStringNumber("ABCD");
        System.out.println(result2);

        System.out.println(checkStringNumber("a kfhs jk3"));


    }

    /**
     * write a static method to accept a String and return Boolean(Yes uppercase)
     * it should return true if the String contains at least one number
     * @param str
     * @return true Boolean Object if the String contains at least one number
     */
    public static Boolean checkStringNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isDigit(eachChar)){
                return Boolean.valueOf(true);

            }
        }
        System.out.println("no number found if you came to this point");
        return Boolean.valueOf(false);

    }
}
