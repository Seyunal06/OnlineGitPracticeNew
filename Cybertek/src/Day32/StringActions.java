package Day32;

public class StringActions {
    public static void main(String[] args) {

        printDash("Seyma");
        printDash("Marcos");
        reverseName();
    }
    public static void printDash(String name){
        for (int i = 0; i < name.length();i++){
            System.out.print(name.charAt(i));
            if (i != name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
    public static void reverseName(){
        String myName ="Seyma";

        for (int x= myName.length()-1;x>=0;x--){
            System.out.print(myName.charAt(x));

        }

    }
}

