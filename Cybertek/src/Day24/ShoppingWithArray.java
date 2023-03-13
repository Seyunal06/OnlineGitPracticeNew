package Day24;

public class ShoppingWithArray {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

//        for (String eachFruit : groceryItems) {
//            System.out.print(eachFruit + " ---> ");
//
//        }
        //created two variables but didnt have to
        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItems[lastItemIndex]; // groceryItems[groceryItems.length-1]

        for (String eachFruit : groceryItems) {
            System.out.print(eachFruit);
            if (!eachFruit.equals(lastFruit)) {
                System.out.print("--> ");
            }

        }
    }
}