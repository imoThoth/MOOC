
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account acc2 = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0);
        acc2.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(acc2.toString());
        System.out.println(myAccount.toString());
    }

}
