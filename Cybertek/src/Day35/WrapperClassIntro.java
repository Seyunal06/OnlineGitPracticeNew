package Day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10;
        // primitive data types are pure value that has no
        // attribute or behaviour

        // each primitive type has a wrapper class that turn into
        // a object so we can treat it as object
        Integer xObj1 = new Integer(12);//not necessary/old version

        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);
        double dValue = xObj2.doubleValue();
        System.out.println("dValue = " + dValue);







    }
}
