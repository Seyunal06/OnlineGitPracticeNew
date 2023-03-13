package Day34;

public class ReturnPractice {
    public static void main(String[] args) {

        //why should you use return in a void method?
        //to terminate the method early

        printMin4Char("Seyma");
        printMin4Char("nia");
    }
    public static void printMin4Char(String name){
        //if the name has less than 4 chars, get out of the method
        if(name.length() < 4){
            System.out.println("Invalid name");
            return;// this makes it get out of the method early
        }
        System.out.println(name);
    }


}
