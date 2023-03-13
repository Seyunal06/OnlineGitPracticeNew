package BootCamp.Day2;

public class PrimeNumbers {
    public static void main(String[] args) {


        //it can only be divisible by itself

        int limit = 1000;


        for (int prime = 2; prime < limit; prime ++){
            Boolean isPrime = true;
            for (int divisor = 2; divisor< prime; divisor++){
                if(prime % divisor ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(prime+ " ");
            }
        }

    }
}
