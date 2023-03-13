package Day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {
    public static void main(String[] args) {


        //Employee is an abstract super type
        //HourEmployee and FullTimeEmployee is specific type

        //if we have Employee data type for e1 variable
        //we can write down the address of anything IS-A Employee

        Employee e1 = new HourlyEmployee("Seyma", 101,55,2000);
        e1.calculateAnnualSalary();
        e1= new FullTimeEmployee("Unal",106,10000);
        e1.calculateAnnualSalary();

        Employee e2 = new HourlyEmployee("Nur", 131,65,2300);

        //what is the easiest way to store these 3 objects together

        //creating a list with 3 Employee object
        List<Employee> allEmployee = Arrays.asList(e1,e2);

        for (Employee each: allEmployee) {
           // System.out.println("each = " + each);
            System.out.println("Name is " + each.name);
            each.calculateAnnualSalary();
        }






    }
}
