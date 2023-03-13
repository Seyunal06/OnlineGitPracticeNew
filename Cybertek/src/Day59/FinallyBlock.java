package Day59;

public class FinallyBlock {
    public static void main(String[] args) {

        //in some cases we want to run certain code
        //no matter exception happens or not
        //as part of try catch

        int[] num = {1,4,6};

        try {
            System.out.println(num[5]);
        }catch (Exception e){
            System.out.println("Exception caught "+e.getMessage());
        }finally {
            System.out.println("THIS CODE WILL ALWAYS RUN EVEN IF WE HAVE EXCEPTION OR NOT");
        }
        System.out.println("the end");




    }
}
