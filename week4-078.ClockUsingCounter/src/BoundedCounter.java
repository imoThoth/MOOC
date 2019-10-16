
public class BoundedCounter {
    //creates instance variables
    private int value;
    private int upperLimit;
   
    
    public BoundedCounter(int upperLimit){
        //upperLimit initialized in constructor
        this.upperLimit = upperLimit;
       
    }
    
    public void next(){
        //checks if value is less than upper limit
        //if true value increases by 1 ... if false value goes back to 0
        if(this.value < this.upperLimit){
            this.value++;
            
        } else{
            this.value = 0;
        }
    }
    
    public String toString(){
        //returns a string format
        //if value is les than 10 shows a 0 and then value, else just the value
        if(this.value < 10){
            return "0" + this.value;
            
        } else{
            return "" + this.value;
        }
        
    }
    
    public int getValue(){
        return this.value; //returns value
    }
    
    public void setValue(int value){
        //checks if value is not more than the upper limit or less than 0
        //if true do nothing, else set this.value to parameter
        if(value < 0 || value > upperLimit){
            //do nothing
        } else{
            this.value = value;
        }
    }
}
