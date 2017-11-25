import java.util.Scanner;

class Prompter {

	private Game game;

	public Prompter(Game game){
   		this.game = game; 
  	}

	public void displayIntro(){
		System.out.println("Welcome in the Hangman game!");
	}


	public void promptGuess(){
		
		boolean isHit;
		System.out.println("Try to guess letter!");
		Scanner scanner = new Scanner(System.in);
		String answerString = scanner.nextLine();
		char answerChar = answerString.charAt(0);
		isHit = game.checkGuess(game.normalization(answerChar));

	}

	public void displayProgress(){
		System.out.printf("Current state: %s, chances left: %s %n",game.checkProgress(), game.getMaxMisses());

	}





}