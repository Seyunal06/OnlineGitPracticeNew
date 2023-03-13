package Day52;

public class BankTest {
    public static void main(String[] args) {

        Account a1 =new Account("Seyma Unal",340000);
        System.out.println("before anything "+a1);
        a1.withdraw(34);
        System.out.println("after withdraw "+a1);
        a1.getBalance();
        System.out.println("get balance "+a1);


        Account a2 =new Account("Marcos Gonzalez",540000);
        System.out.println("before anything " + a2);
        a1.transferAll(a2);
        System.out.println("after transfer " + a2);
        System.out.println("a1 = " + a1);

        a1.deposit(3000);
        System.out.println("after deposit "+a1);

        Account a3 =new Account("race car",340000);

        System.out.println("does a1 have palindrome "+a1.isPalindrome());
        System.out.println("does a2 have palindrome "+a2.isPalindrome());
        System.out.println("does a3 have palindrome "+a3.isPalindrome());

    }
}
