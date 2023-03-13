package Day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
       // System.out.println(s1.allProducts);

        //s1.allProducts.add(new Product("imac",3999));
        //System.out.println(s1.allProducts);

        List<Product> seymasList = Arrays.asList(new Product("cookie",3),
        new Product("tea",4),
        new Product("coffee",5),
        new Product("muffins",4));
        Store s2 = new Store("Coffee shop",seymasList);
        System.out.println(s2);

    }
}
