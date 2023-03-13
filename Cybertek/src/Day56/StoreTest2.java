package Day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {

        List<Product> seymasList = Arrays.asList(new Product("cookie",3),
                new Product("tea",4),
                new Product("coffee",5),
                new Product("muffins",4));
        Store s2 = new Store("Coffee shop",seymasList);
        System.out.println(s2);

        s2.addProduct(new Product("cheesecake ",10));
        System.out.println("s2 = " + s2);
        s2.addProduct("latte",3);
        System.out.println(s2);

        System.out.println(s2.getProductCount());
        s2.displayProduct();

        s2.removeProduct(new Product("cheesecake ",10));
        System.out.println("is there cheesecake with the price of 10? "
                +s2.doesProductExists(new Product("cheesecake ",10)));
        System.out.println("where is cheesecake with the price of 10? "
                +s2.index(new Product("cheesecake ",10)));

        s2.removeProduct(new Product("cheesecake ",10));





    }
}
