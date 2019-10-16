public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("parameter");
       // HangmanUserInterface game = new HangmanUserInterface(logic);
        
        //game.start();
        System.out.println(logic.hiddenWord());
        
        logic.guessLetter("A");
        logic.guessLetter("S");
        logic.guessLetter("D");
        logic.guessLetter("F");
        logic.guessLetter("G");
        logic.guessLetter("H");
        logic.guessLetter("I");
        
        System.out.println("Guessed Letters: ASDFGHI");
        System.out.println(logic.hiddenWord());
       
        
      
        
    }
}
