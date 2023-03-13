package Day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        //change third price to $10
        priceList.set(2, 10.0);

        //add 4 dollars to first price(original price + 4)
        priceList.set(0, priceList.get(0)+4);

        //change last price to sum of first and second price
        Double sum= priceList.get(0)+ priceList.get(1);
        priceList.set(priceList.size()-1, sum);

        //give 40% off to second price
        priceList.set(1, priceList.get(1)* 0.6);

        //double the value of each and every price in the list
        //priceList.set(0, priceList.get(0)*2);//this is how we do it for one

        for (int i = 0; i < priceList.size(); i++){
            double newValue=priceList.get(i)* 2;
            priceList.set(i, newValue);
        }

        System.out.println(priceList);



        //cut the price into half if the price is more than $20
        for (int i = 0; i <priceList.size() ; i++) {

            double eachPrice = priceList.get(i);

            if(eachPrice > 20){
                priceList.set(i, eachPrice/2);
            }
        }
        System.out.println("Pricelist after cutting half the price thats more than 20 \n" + priceList);

        //swap the first value with last value
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);

        System.out.println("Pricelist after swapping first and last value \n" + priceList);



    }
}
