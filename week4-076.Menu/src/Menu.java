
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        
        this.meals = new ArrayList<String>();
        
    }
    
    public void addMeal(String meal){
        //adds a meal to the array, unless the meal already exist within the array
        if(this.meals.contains(meal)){
            //do nothing
        } else{
            this.meals.add(meal);
        }
        
     }
    
    public void printMeals(){
        //uses for loop to print out list of items in this.meals
        //each item is printed out using the food variable
        for(String food: this.meals){
            System.out.println(food);
        }
    }
    
    public void clearMenu(){
        //clears the menu
        this.meals.removeAll(meals);
    }
   
}
