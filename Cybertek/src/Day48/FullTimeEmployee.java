package Day48;

//a non-abstract sub class of abstract super class
//is called concrete class
//this class is responsible for providing body(implementation)
//for all abstract methods from super class
public class FullTimeEmployee extends Employee{

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Full time Employee yearly: " + monthlySalary *12);
    }
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , Yearly : " + monthlySalary *12 +
                '}';
    }
}
