
public class LyyraCard {
    //creates instance variable double
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        //instance is initialized to balanceAtStart
        this.balance = balanceAtStart;
    }
    
    public String toString(){
        //returns string format of balance
        return "The card has " + this.balance + " euros";
    }
    public void payEconomical(){
        //checks if balance is more than or equal to 2.50
        //takes money from balance if true
        //does nothing if false
        double payEconomical = 2.50;
        
        if(balance>=2.50){
            this.balance = this.balance - payEconomical;
        }else{
            //do nothing
        }
        
    }
    public void payGourmet(){
        //checks if balance is more than or equal to 4
        //if true, gourmet price is with drawn from the balance
        double payGourmet = 4.00;
        
        if(balance>=4.00){
            this.balance = this.balance - payGourmet;
        }else{
            //do nothing
        }
      }
    
    public void loadMoney(double amount){
       //checks balance and loads amount into balance
       //if balance exceeds 150, price is truncated
        if(amount>0){
           this.balance+=amount;
       }
        if(balance>150){
            this.balance = 150;
        }
    }
}
