package Day22;

public class ArrayPractice {
    public static void main(String[] args) {
        double[] prices = new double[5];

        System.out.println(prices[0]);

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char[] name = new char[5];
        name[0] = 'S';
        name[1] = 'e';
        name[2] = 'y';
        name[3] = 'm';
        name[4] = 'a';
        //exclusive to a char Array it will allow you to right the name directly
        System.out.println(name);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
    }
}
