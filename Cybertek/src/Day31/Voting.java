package Day31;

public class Voting {
    public static void main(String[] args) {

       checking(15);

       checking(22);
       //also able to declare a variable here
        int yourAge = 12;
        checking(yourAge);
    }
    public static void checking(int age){
        //this is how you call it in the main and are able to insert other variables
        //int age = 15;
        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote yet");
        }
    }
}
