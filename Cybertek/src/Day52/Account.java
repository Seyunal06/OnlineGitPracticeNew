package Day52;

public class Account implements Transferable,Comparable<Account>{

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    //add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance>otherAccount.balance){
            return 1;
        }else if (this.balance<otherAccount.balance){
            return -1;
        }else {
            return 0;
        }
        //return this.balance - otherAccount.balance
    }
    @Override
    public void transferAll(Account otherAccount) {
//        //get the balance of current account
//        //deposit to the other account
//        otherAccount.balance += this.balance;
//        //set current account balance to 0
//        this.balance=0;
        //or optionally use the method
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    //add a method called isPalindrome and return ture if the name is palindrome
    //if a String is still same String after reversing it, it is regarded as palindrome
    public boolean isPalindrome(){
        //first store it into temp and replace all the space and make it lowercase
        //we dont want to actually change the name of the account, so we just work with its copy
        String nameCopy = this.name.toLowerCase().replace(" ","");
        //we need to reverse the value then check whether they are still the same String or not
        String reverseResult="";
        for (int i=nameCopy.length()-1; i>=0;i--){
            reverseResult+=nameCopy.charAt(i);
        }
        return nameCopy.equals(reverseResult);
    }


}
