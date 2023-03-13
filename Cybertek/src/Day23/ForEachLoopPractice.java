package Day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long[] salaries = {100000, 200000, 1500000, 115000, 60000};

        for(long eachSalary: salaries){
            System.out.println("eachSalary = " + eachSalary);
        }

        for(long salary: salaries){

            if(salary <= 100000){
                continue;
            }
            System.out.println("salary = " + salary);
        }
    }
}
