package Day47;

public class Student {
    //final INSTANCE FIELD
    final int studentID;
    //public final static field with initial value set
    //this type of field name is always suggested to make all uppercase
    //to make it clear that this is a public static field that never changes
    //other languages have specific terms called CONSTANT for this
    //if interviewer asks how do I define CONSTANT in Java?
    //you would say I will create public static final field
    public static final String SCHOOL = "Cybertek";

    public Student(int studentID){
        this .studentID = studentID;
    }





}
