package Day52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Seyma",100000));
        accountList.add(new Account("Marcos",100000));
        accountList.add(new Account("Ali",100000));
        accountList.add(new Account("Hatice",100000));
        accountList.add(new Account("Busra",100000));
        accountList.add(new Account("Fatih",100000));
        accountList.add(new Account("BOB",100000));

        System.out.println("accountList before sorting = " + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after sorting = " + accountList);

        //transfer everyone's money to your account
        Account myAccount = new Account("Me",0);

        for (Account each: accountList){
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);

        System.out.println(accountList);


        Account a1 = new Account("Polymorphism1",2000);
        Transferable t1 = new Account("Polymorphism2",2000);;
        Comparable c1 = new Account("Polymorphism4",2000);
        Object o1 = new Account("Polymorphism3",2000);



    }
}
