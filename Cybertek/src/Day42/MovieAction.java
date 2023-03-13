package Day42;

public class MovieAction {
    public static void main(String[] args) {

        Movie m1 = new Movie();
        System.out.println(m1);

        Movie m2 = new Movie("Joker",2.2,"Drama");
        Movie m3 = new Movie("Frozen2",1.5,"Family");
        Movie m4 = new Movie("Pursuit of Happiness",2.0,"Drama");

        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        //I want to get the name of m2 separately so I can do something
        //I cant access since it private so I need to use a getter
        //System.out.println(m2.name);
        System.out.println(m2.getName());










    }
}
