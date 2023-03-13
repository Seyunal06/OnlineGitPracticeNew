package Day36;

public class MethodWrapperTypes {
    public static void main(String[] args) {

        //when we have a class, it becomes a type
        //String has a class of its own so we can create an object
        //take action with that object
        //create variable with type String
        //create method parameters with data type String
        //create method return type with data type String

        // 12 is --> autoboxing
        Integer i1 = 12; //you dont have to write this part
        Integer i2 = 20;

        sumPrint(i1,i2);
        //we directly pass int knowing that autoboxing
        // can take care of converting to object
        // if not specified otherwise, this is recommended
        sumPrint(23,10);

        //this is the way to do it
        //its expecting 2 Integer object and we use
        //Integer.valueOf to provide 2 Integer objects
        sumPrint(Integer.valueOf(23), Integer.valueOf(10));
        //its expecting 2 Integer object and we use
        //new keyword to provide 2 Integer objects
        sumPrint(new Integer(23), new Integer(10));

        System.out.println("--------------------------------------");

        printDoubleValue(10);

        //why are we able to pass Integer Object to a method that accepts int
        //it will turn it into int by the power of auto-unboxing
        printDoubleValue(new Integer((10)));

    }

    /**
     * This method adds two Integer numbers and prints
     * @param num1 type Integer, first number to add
     * @param num2 type Integer, second number to add
     * @return
     */
    public static void sumPrint(Integer num1, Integer num2){

        //we can not add two objects
        //the moment the + operator appeared,
        //compiler will turn num1 and num2 into int so it can add them numerically
        //Integer to int conversion --> auto-unboxing
        System.out.println(num1 + num2);
    }

    /**
     * This method will print the doubled value of what user passed
     * @param x
     * @return
     */
    public static void printDoubleValue(int x){
        System.out.println("after doubling x = " +(x*2));
    }
}
