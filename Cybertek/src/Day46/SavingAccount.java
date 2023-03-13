package Day46;

public class SavingAccount extends BankAccount {

//    String accountHolder;
//    long accountNum;
//    double balance;
    double interestRate;


    public SavingAccount(String accountHolder,long accountNum,double balance,double interestRate){

        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate;

    }
    //BAD IDEA TO HAVE MAIN HERE
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Seyma",12345,50000,4.2);
        System.out.println("s1.toString() = " + s1);
        s1.withdraw(10000);
        System.out.println("s1 = " + s1);

    }
    //in our SavingAccount, if we withdraw amount you withdraw
    //you get 30 dollar penalty
    //so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw(int amount){
        //balance -= (amount +30);
        //30 is the penalty
        super.withdraw(amount+30);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }




















}
