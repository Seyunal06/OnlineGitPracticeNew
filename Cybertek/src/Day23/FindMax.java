package Day23;

public class FindMax {
    public static void main(String[] args) {

        long[] salaries = {100000, 200000, 150000, 115000, 60000};

        long max = salaries[0];

        //shortcut iter
        for (long salary : salaries) {

            if(salary > max){
                max = salary;
            }
        }
        System.out.println("max = " + max);
    }
}
