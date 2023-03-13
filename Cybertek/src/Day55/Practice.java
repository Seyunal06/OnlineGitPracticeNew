package Day55;

public class Practice {

    //any object created using this constructor
    //should call Practice(int x) constructor with value 100
    public Practice(){

        this(100);
        System.out.println("no arg constructor");
    }
    //any object you created using constructor must call no arg constructor first
    public Practice(int x){
        //super();
        //this();
        System.out.println("1 arg constructor "+ x);

    }

    public static void main(String[] args) {
        Practice t = new Practice();
    }

}
