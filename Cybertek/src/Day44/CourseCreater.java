package Day44;

public class CourseCreater {
    public static void main(String[] args) {

        Course c1 = new Course("Java","foundation");
        Course c2 = new Course("Selenium","automation");
        Course c3 = new Course("SQL","database");
        Course c4 = new Course("API","webservices");
        Course c5 = new Course("Agile","soft skills");

        System.out.println("Course.counter = " + Course.counter);


    }
}
