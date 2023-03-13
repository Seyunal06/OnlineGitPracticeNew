package Day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
   private List<Product> allProducts;

   //find out all products that are more than average price
    public List<Product> moreThanAveragePrice(){
        List<Product> myList = new ArrayList<>();
        double average =findAverage();
        for (Product each: allProducts){
            if (each.getPrice()>average){
                myList.add(each);
            }
        }
        return myList;
    }

   public Product maxPrice(){
       int max= Integer.MIN_VALUE;
       int maxIndex =-1;
       for (int x =0; x<allProducts.size(); x++){
           if (allProducts.get(x).getPrice()>max){
               max = allProducts.get(x).getPrice();
               maxIndex =x;
           }
       }
       System.out.println("max price: "+max);
       return allProducts.get(maxIndex);

   }

   public double findAverage(){
       //average is the sum of the products divided by product count
       return findSumOfPrices()/getProductCount();
   }

   public int findSumOfPrices(){
       int sum=0;
       for (Product each: allProducts){
           sum += each.getPrice();
       }

      return sum;
   }

   public void removeProduct(Product p){
       if (doesProductExists(p)==true){
           allProducts.remove(p);
       }else{
           System.out.println("We don't have " +p);
       }
   }

   public int index(Product p){
       return allProducts.indexOf(p);
   }

   public boolean doesProductExists(Product p){

       return allProducts.contains(p);
   }

   //displaying product
    public void displayProduct(){
        System.out.println(name+"'s Store has below products");
        for (Product each: allProducts){
            System.out.println("each item: "+each);
        }
    }
   //counting how many products we have in the store
   public int getProductCount(){
       return allProducts.size();
   }

   public void addProduct(Product p){
       System.out.println("calling product p ");
       allProducts.add(p);
   }
   public void addProduct(String productName,int productPrice){
       Product newP = new Product(productName,productPrice);
       allProducts.add(newP);
   }


    public Store(){

        this.name ="Cybertek Store";
        this.allProducts = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }

    public Store(String name, List<Product> otherList) {
        this();
        this.name = name;
        allProducts.addAll(otherList);



    }
}
