public class newHangman {

  public static void main(String[] args) {
    
   
    Game game = new Game(args[0]);
    Prompter prompter = new Prompter(game);

    prompter.displayIntro();
    
    do{
        prompter.promptGuess();
        prompter.displayProgress();
      } while(game.getMaxMisses()>0 && game.isWin()==false);

    if(game.isWin() == true){
      System.out.println("Congratz! You won!!!");
    } else {
      System.out.println("You loose!!!");
    }


  }
  
}