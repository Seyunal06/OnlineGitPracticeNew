package Day15;

public class SubString {
    public static void main(String[] args) {

        //              012345678901234567
        String movie = "A walk to remember";
        
        String wordOf = movie.substring(7,9);

        System.out.println(wordOf);

        wordOf = movie.substring(2,6);
        System.out.println(wordOf);

        // starting from walk to the end
        int startingFrom = movie.indexOf("") + 1;
        int ending = movie.length();

        System.out.println(movie.substring(startingFrom, ending));
    }
}
