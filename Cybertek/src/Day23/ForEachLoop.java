package Day23;

public class ForEachLoop {
    public static void main(String[] args) {

        double[] prices ={99.23, 11.99, 100.23, 99.99, 56.34};

        for(int x= 0; x< prices.length; x++){
            System.out.println(prices[x]);
        }

        //for each loop can only be used for array
        //there is no infinite loop in for each loop
        //doesn't count Index
        for(double eachPrice : prices){
            System.out.println("each price = " + eachPrice);
        }

    }
}
