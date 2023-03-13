package Day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    //always add no arg constructor in super class
    //to avoid error in sub class bc of super() call
    public BankAccount(){ }

    public BankAccount(String accountHolder, long accountNum,double balance){
        //super();
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public void deposit(int amount){ balance+= amount; }

    public void withdraw(int amount){ balance -= amount; }




}
