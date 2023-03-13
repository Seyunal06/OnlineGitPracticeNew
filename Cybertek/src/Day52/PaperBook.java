package Day52;

public class PaperBook extends Book implements Readable{

    int weight;

    public PaperBook(String name, String author,int weight) {
        super(name, author);
        this.weight=weight;
    }
    @Override
    public void displayInfo() {
        System.out.println("Paper book's name is: "+name
        +" and the author is: "+author
        +" and it weighs "+weight+ " pound");
    }
    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    @Override
    public void takeNotes() {
        System.out.println("Bookmark and taking notes from "+ name);
    }
    @Override
    public void read() {

    }
}
