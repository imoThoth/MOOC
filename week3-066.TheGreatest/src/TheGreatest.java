import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // finds the greatest number in an array list
        int greatest = list.get(0);//uses first number in array list as dummy
         for(int numbers : list){ //prints out nubers individualy
             
             int currentGreatest = Math.max(numbers, greatest); //finds the current biggest number and stores in variable current greatest
             if(greatest > currentGreatest){ //checks if dumm is more than greatest
                 //do nothing
             } else{
                 greatest = currentGreatest; //if false, dummyGreatest is now 
             }
         
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
