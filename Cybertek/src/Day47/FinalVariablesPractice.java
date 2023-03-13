package Day47;

public class FinalVariablesPractice {
    public static void main(String[] args) {

        //declaring and initializing a variable
        //declaring and assigning initial value
        int x =10;
        //re-assigning new value to the variable
        //storing/giving new value to the variable
        //changing the original value of the variable
        x=100;

        //declaring and initializing a final variable
        //declaring and assigning initial value to a final variable
        final int a = 20;

        //re-assigning new value to the final variable --ERROR!!!!
        //a = 200;

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        //cannot reassign the value bc its final
        //s1 = new Student(102);
        //you can still change internal data attached to the object
        //as long as its the same object s1 pointing to
        //as long as the address does not change
        //s1.studentID = 200;
        System.out.println(s1.studentID);

        System.out.println(Student.SCHOOL);
        //cannot reassign value bc it is final
        //Student.school = "abc";

        //Intellij automatically recognizes constant (public static final field)
        //it will automatically make it italic(this can not be done by programmer)
        //easy way to distinguish between fields and methods is
        //by looking at () at the end

        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);

        printDoubleNumber(12);

    }

    /**
     * a void method that accepts a number and print out doubled number
     * @param x
     */
    //anywhere we declare a variable we have an option to make it final (including method parameter)
    //making method parameter final
    //it wil make the method only use the argument user passed without modifiying it;
    public static void printDoubleNumber( int x){
        x = x *2;
        System.out.println("x*2 = " + x);
    }








}
