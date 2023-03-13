package Day52;

public interface KnowledgeBank {

    public abstract void takeNotes();

    public default void showTableOfContent(){
        System.out.println("Chapter 1 till chapter 10");
    }



}
