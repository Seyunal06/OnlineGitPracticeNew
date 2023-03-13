package Day52;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author,double duration) {
        super(name, author);
        this.duration=duration;
    }

    public void listen(){
        System.out.println("listening to audio book "+name+" by "
        +author);
    }

    //this is an abstract method implementation from Book class
    @Override
    public void displayInfo() {
        System.out.println("The name of audioBook is "+name+
                " and the author is "+author+", the duration is "
        +duration+" min");
    }
    //this is an abstract method implementation from KnowledgeBank interface
    @Override
    public void takeNotes() {
        System.out.println("Taking notes on the digial book by "+
                name+" writing the provided digital table");
    }
    //this is an abstract method implementation from KnowledgeBank interface
    @Override
    public void showTableOfContent() {
        System.out.println("If you want to see table of content of "
        +name+" by "+author+" press...");
    }
}
