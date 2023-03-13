package Day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {

        Addition a1 = new Addition(10,90);
        System.out.println("a1  " + a1);
        a1.calculate();
        System.out.println("a1  " + a1);

        Subtraction s1 = new Subtraction(90,10);
        System.out.println("s1 = " + s1);
        s1.calculate();
        System.out.println("s1 = " + s1);

        Subtraction s2 = new Subtraction(10,90);
        System.out.println("s2 = " + s2);
        s2.calculate();
        System.out.println("s2 = " + s2);

        Multiplication m1 = new Multiplication(10,3);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        Division d1 = new Division(10,5);
        System.out.println("d1 = " + d1);
        d1.calculate();
        System.out.println("d1 = " + d1);

        Division d2 = new Division(10,50);
        System.out.println("d1 = " + d2);
        d2.calculate();
        System.out.println("d1 = " + d2);

        System.out.println("---------------------------------");
        List<Question> allTestQuestions = Arrays.asList(a1,s1,s2,m1,d1,d2);
        for(Question eachQ :allTestQuestions){
            System.out.println("eachQ = " + eachQ);
        }






    }
}
