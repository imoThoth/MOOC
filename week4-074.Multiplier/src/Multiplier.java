

public class Multiplier {
    //creates variable instance number
    private int number;
    
    public Multiplier(int number){
        //variable is instantialized within constructor
        this.number = number;
    }
    
    public int multiply(int otherNumber){
        //variable multiply of int type created
        //multiplaction of number given in object creation and multiply parameter
        //multiply is returned
        int multiply = this.number * otherNumber;
        return multiply;
        
    }
}
