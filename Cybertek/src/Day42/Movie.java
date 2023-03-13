package Day42;

public class Movie {

    private String name;
    private double length;
    private String genre;


    public Movie(){
        System.out.println("Empty movie");
    }
    //write a constructor to set all the fields value
    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    //toString method so we can directly print out
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
