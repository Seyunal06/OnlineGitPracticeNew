package Day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Macbook pro",2999));
        productList.add(new Product("Sony TV",499));
        productList.add(new Product("Macbook air",1299));
        productList.add(new Product("Iphone x",999));
        productList.add(new Product("Iphone XL",1299));
        productList.add(new Product("Samsung 10",1188));

        System.out.println("productList.size = " + productList.size());

        boolean result = productList.contains(new Product("Sony TV",499));
        System.out.println("is it Sony TV? : "+result);



//        boolean result = false;

//        for (Product each: productList){
////            if (each.getName().equals("Sony TV") && each.getPrice()==499){
////                result =true;
////            }
//        if (each.equals(new Product("Sony TV",499))){
//            result =true;
//        }
//    }



    }
}
