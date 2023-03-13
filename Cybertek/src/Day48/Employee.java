package Day48;

public abstract class Employee {

    String name;
    int id;

    public Employee(){ }

    //WHY DO WE HAVE CONSTRUCTOR HERE
    //WE CANNOT CREATE AN OBJECT OUT OF IT?
    //WHAT IS THE POINT?
    //so that sub class can reuse the code of setting id and name
    public Employee(String name, int id){
        this.id = id;
        this.name = name;
    }
    public abstract void calculateAnnualSalary();
    //this is optional: the only reason we put it in here was
    //to enforce sub class to provide toString method
    public abstract String toString();
}
