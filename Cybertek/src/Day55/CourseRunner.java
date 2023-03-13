package Day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(
                Arrays.asList("Seyma","Marcos","Gonzalez","Unal"));
        Course java = new Course("Java",lst);
        System.out.println("java = " + java);

        //using the method that we made
        java.addStudent("lisa");

        java.addManyStudents(Arrays.asList("more","names","on","the","list"));

        //or use addAll method to add more than one
        //java.studentNames.addAll(Arrays.asList("tomato","tree"));
        java.studentNames.add("Potato");

        System.out.println("java = " + java.studentNames);

        //since you added on to the list
        System.out.println(lst);



    }
}
