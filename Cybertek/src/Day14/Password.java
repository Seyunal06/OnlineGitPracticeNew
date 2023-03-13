package Day14;

public class Password {
    public static void main(String[] args) {

        String password = "ashtwo";
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;
        boolean mustContain_or$ = password.contains("_") || password.contains("$");
        boolean mustNotContainSpace = ! password.contains(" ");
        boolean mustStartWithAb = password.startsWith("Ab");

        if(min8max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb ){
            System.out.println("valid password");
        }else {
            System.out.println("invalid password");
        }
    }
}
