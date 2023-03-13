package Day35;

public class ParsingPractice {
    public static void main(String[] args) {

        String sentence = "I bought 3 tomatoes and the price was 3,14 each";

        String[] allWords =sentence.split(" ");
        //int count = Integer.parseInt(allWords[2]);
        //this will also give the same result
        //valueOf returns an object then unbox it and save it into count
        int count = Integer.valueOf(allWords[2]);


        String priceString = allWords[allWords.length-2];
        priceString = priceString.replace(",",".");
        double price = Double.parseDouble(priceString);

        System.out.println("Total price is  = " + (count * price));







    }
}
