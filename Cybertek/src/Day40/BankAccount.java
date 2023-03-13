package Day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    //set all the value
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance){
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    //show account balance
    public void showBalance(){
        System.out.println("balance = " + balance);
    }
    public void showAccountType(){
        System.out.println("accountType = " + accountType);
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;//double the balance
    }
    public void withdraw(double amount){
        balance -= amount;//decrease
    }
    public void withdraw100$Cash(){
        withdraw(100);//reusing a functionality we already have
        //or balance = balance -100
    }
    public void purchaseProduct(double productPrice, int count){
        double totalPrice = productPrice * count;
        balance -= totalPrice;
        //or withdraw(totalPrice);
    }
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
