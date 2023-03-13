package Day60;

public class BreakTimeException extends RuntimeException{




}
class Main {


    public static void main(String[] args) {

        //throw new BreakTimeException();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("my own thing is caught");
        }

    }
}