package Day48;

public class HourlyEmployee extends Employee{

    double hourlyWage;
    int numberOfHours;

    public HourlyEmployee(String name,int id,double hourlyWage,int numberOfHours){
        super(name, id);
        this.hourlyWage= hourlyWage;
        this.numberOfHours= numberOfHours;
    }


    @Override
    public void calculateAnnualSalary(){
        System.out.println("Hourly Employee yearly: " +(hourlyWage * numberOfHours));
    }




    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numberOfHours=" + numberOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , yearly salary = " + (hourlyWage * numberOfHours)
                +'}';
    }
}
