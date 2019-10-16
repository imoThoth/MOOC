public class DecreasingCounter {
    private int value;  
    private int initial;// instance variable that remembers the value of the counter
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = this.value;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // decreases value by 1, unless the value is less than 0
        if(this.value==0){
            //do nothing
        }else{
             this.value--;
        }  
    }
 // and here the rest of the methods
    public void reset(){
        //resets the value to 0
        this.value = 0;
    }
    public void setInitial(){
        //sets the value to the value at the start/initial value
        this.value = this.initial;
    }
}
