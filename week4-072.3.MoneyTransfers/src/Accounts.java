
public class Accounts {
    public static void transfer(Account from, Account to, double howMuch){ //creates method transfer using accounts object
        from.withdrawal(howMuch); //calls object method withdrawal
        to.deposit(howMuch); //calls object method deposit
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A",100);
        Account b = new Account("B",0);
        Account c = new Account("C",0);
        transfer(a,b,50);
        transfer(b,c,25);
    }


}
