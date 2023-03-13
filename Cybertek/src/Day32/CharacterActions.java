package Day32;

public class CharacterActions {
    public static void main(String[] args) {

        printAlphabet();
        printReverseAlphabet();
        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('A','A');

    }
    public static void printAlphabetInRange(char begin, char end){
        if (begin< end){
            System.out.println("We need to increment from " + begin + " till " + end);
            for (char iChar = begin; iChar<=end; iChar++){
                System.out.println(iChar + " ");
            }
            System.out.println();
        }else if (begin> end){
            System.out.println("We need to decrement from " + begin + " till " + end);
            for (char iChar = begin; iChar>=end; iChar--){
                System.out.println(iChar + " ");
            }
            System.out.println();
        }else {
            System.out.println("They are same character!!!");
        }
    }
    public static void printAlphabet(){
        for (char iChar = 'A'; iChar <='Z'; iChar++){
            System.out.print(iChar+" ");
        }
        System.out.println();
    }
    public static void printReverseAlphabet() {
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();

    }
}
