package Day59;

import java.io.IOException;

public class CheckedNUnchecked {
    public static void main(String[] args) throws InterruptedException{//throws IOException{

        String x = "abc";
        System.out.println("START");

        //Exception hierarchy
        //Throwable -> child class -> exception

        //try to throw the exception programmatically if it compiles, it means its RunTimeException
        //throw new RuntimeException("just throwing it out");

        //is the class Exception a type of checked Exception or unchecked?

       // try{
        Thread.sleep(3000);
            //throw new IOException("just throwing this away");
//        }catch (IOException e){
//            System.out.println("Exception caught");
//        }






    }
}
