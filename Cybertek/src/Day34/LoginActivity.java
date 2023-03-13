package Day34;

public class LoginActivity {
    public static void main(String[] args) {

        //you can click over it and have it do a method for you
        //shortcut
        loginVoid("my username", "abc123");
        loginVoid("user","abc123");

        boolean result = loginReturn("user", "abc123");
        System.out.println(result);

        //example
        if(loginReturn("user","abc123")){
            System.out.println("Add Java book to cart");
            System.out.println("Pay for java book in cart");
            System.out.println("View the order");
        }else {
            System.out.println("NOO shopping unless you sign in");
        }

    }

    public static void loginVoid(String user, String password) {
        if(user.equals("user")&& password.equals("abc123")){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Fail");
        }
    }

    public static boolean loginReturn(String user, String password) {

        //return user.equals("user") && password.equals("abc123");

        if(user.equals("user") && password.equals("abc123")){
            return true;
        }else {
            return false;
        }


    }


}
