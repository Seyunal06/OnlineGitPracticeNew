package Day36;

public class WrapperReview {
    public static void main(String[] args) {

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);

        // i3 is a primitive type variable
        // reference type -> everything thats not primitive
        // it has its own class

        // Auto boxing: primitive to wrapper type conversion
        Integer i3 = 45;//preferred way

        int i4 = 54;
        //Auto unboxing: wrapper type to primitive type conversion
        int i5 = new Integer(100);// new Integer(100)

        //AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        //OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS
    }
}
