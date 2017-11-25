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
		System.out.printf("Try to guess letter! %n %n");
		Scanner scanner = new Scanner(System.in);
		String answerString = scanner.nextLine();
		char answerChar = game.normalization(answerString.charAt(0));
		if(game.checkIfGuessed(answerChar) == true){
			System.out.printf("You already typed this! %n %n");
		}
		else {isHit = game.checkGuess(answerChar);}

	}

	public void displayProgress(){
		System.out.printf("Current state: %s, chances left: %s %n ",game.checkProgress(), game.getMaxMisses());

	}





}