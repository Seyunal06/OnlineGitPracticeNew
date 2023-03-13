package Day48;

public class HR_Action {
    public static void main(String[] args) {

        //Employee e1 = new Employee();

        HourlyEmployee e1 = new HourlyEmployee("Seyma", 101,55,2000);
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Marcos", 103,65,4000);
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee("Unal",106,10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Gonzalez",107,13000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);

        //each and every class we create, it will become a data type(reference type)






    }
}
