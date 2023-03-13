package Day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {


        String[] marvelHeroes ={"Iron Man", "Captain America",
                "Spider man", "Black Panther", "Hulk",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes) );
        int size = marvelHeroes.length;
        System.out.println("Hero count --> " + size);

        String itemToSearch = "Wanda" ;
        int count = 0;

        //to count just black without caring about case
//        for (String eachHero:marvelHeroes){
//            if (eachHero.toLowerCase().contains("black")){
//                count++;
//            }
//        }

        for (String eachHero:marvelHeroes){
            if (eachHero.equals(itemToSearch) ){
                count ++;
            }
        }

        System.out.println("count = " + count);

    }
}
