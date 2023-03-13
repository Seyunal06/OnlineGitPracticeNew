package Day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest3 {
    public static void main(String[] args) {

        List<Product> seymasList = Arrays.asList(new Product("cookie",2),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("mocha",7),
                new Product("frappe",8),
                new Product("double shot",15),
                new Product("muffins",5));

        Store s2 = new Store("Coffee shop",seymasList);
        System.out.println(s2);

        System.out.println("s2.findSumOfPrices() = " + s2.findSumOfPrices());
        System.out.println("s2.findAverage() = " + s2.findAverage());

        s2.maxPrice();

        System.out.println("s2.moreThanAveragePrice() = " + s2.moreThanAveragePrice());


    }
}
