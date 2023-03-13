package Day12;

public class LoginTest {
    public static void main(String[] args) {

        String userName = "user123", password = "efg";

        //System.out.println(! userName.equals("user123"));

        if(userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login successful");
        }else if(! userName.equals("user123") && password.equals("pass123")){
            System.out.println("Username is NOT correct!");
        }else if(userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Password is NOT correct!");
        }else{
            System.out.println("Username and password are both wrong!!!");
        }
    }
}
