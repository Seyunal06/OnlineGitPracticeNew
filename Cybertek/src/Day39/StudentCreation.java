package Day39;

public class StudentCreation {
    public static void main(String[] args) {
        //how do we create an object out of a template

        Student s1 = new Student();
        //set the values for s1 object attribute
        s1.name = "Seyma";
        s1.age = 23;
        s1.gender = 'F';
        //get the values for s1 object attribute
        System.out.println("first name--> " + s1.name);

        Student s2 = new Student();
        s2.name = "Marcos";
        s2.age = 23;
        s2.gender = 'M';

        System.out.println("second name--> " + s2.name);
        //I want to save the age before I change it so I can have access to it
        int oldAge = s2.age;

        //new age
        s2.age = 28;
        System.out.println(s2.name+ " | " +s2.age+ " | " +s2.gender);

        System.out.println("Marcos's real age--> " + oldAge);
        //whats the difference between old age and new age
        System.out.println(s2.age-oldAge);



    }
}
