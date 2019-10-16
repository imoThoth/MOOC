
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account acc1 = new Account("David", 100.00);
        Account acc2 = new Account("Matt's Account",1000.00);
        Account acc3 = new Account("My Account", 0);
        acc2.withdrawal(100); 
        acc3.deposit(100);
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        
        acc1.deposit(20);
        System.out.println(acc1.toString());
        //acc1.toString();
    }

}
