package Day59;

public class General {
    public static void main(String[] args) {


        //Object o = new String("abc");
        //can I get the first char using o
        //System.out.println(o.charAt(0));

        System.out.println("the start");
        String str =null;

        try{
            System.out.println(str.charAt(0));
            System.out.println("end of try");
        }catch (NullPointerException bla){
            System.out.println("no object here");
        }catch (Exception e){
            System.out.println("this is the rest of exception");
        }



        System.out.println("the end");

    }
}
