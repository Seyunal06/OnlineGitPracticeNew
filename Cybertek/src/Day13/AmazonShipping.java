package Day13;

public class AmazonShipping {
    public static void main(String[] args) {

        String memberType = "member";
        double amount = 45.99d;
        int shippingFee = 0;

        if(memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("Free shipping in 1 day!");
            System.out.println("Your total is " + amount);
        }else if(amount > 25){
        //}else if(!memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25){
            System.out.println("NOT a prime member but your order is more than 25");
            System.out.println("Free shipping and your total is " + amount);
        }else{
            System.out.println("Do you want to become a member?");
            shippingFee = 5;
            amount += shippingFee;
            System.out.println("Your total is " + amount );
        }
    }
}
