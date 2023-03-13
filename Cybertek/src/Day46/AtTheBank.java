package Day46;

public class AtTheBank {
    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount("Seyma",54321,10000);

        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);//it gives us additional 200 by requirement
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);//withdraw takes same amount of money
        System.out.println("acc1 = " + acc1);











    }
}
