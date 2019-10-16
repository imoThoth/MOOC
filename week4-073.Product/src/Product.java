
public class Product {
    //creates instances 
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        //instances initlialized using this
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
       }
    
    public void printProduct(){
        //method prints string
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }
    
}

