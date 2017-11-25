class Game {

	private final String answer;
	private String hits = "";
	private String misses = "";
	public static int MAX_MISSES = 7;

		// open game
	public Game(String answer){
		this.answer	= answer.toLowerCase();
	}


	public char normalization(char answerChar){
		answerChar = Character.toLowerCase(answerChar);
		return answerChar;
	}

	public boolean checkIfGuessed(char guess){
		return hits.indexOf(guess)!= -1 || misses.indexOf(guess)!=-1;
	}

	public boolean checkGuess(char guess){
		boolean isHit = (answer.indexOf(guess)!=-1);
		if(isHit == true)
		{
			hits += guess;
			System.out.printf("Litter %s is in our word! %n", guess);
		}	
		else{
			misses += guess;
			MAX_MISSES -= 1;
		}
		return isHit;
	}
			// sprawdz jakie litery zostaly odgadniete
	public String checkProgress(){
		String ReturnProgress = "";
		for(char letter : answer.toCharArray()){
			if(hits.indexOf(letter)!=-1){
				ReturnProgress += letter;
			}
			else{ReturnProgress += '_';}

		}

		return ReturnProgress;
	}	

	public int getMaxMisses(){
		return MAX_MISSES;

	}

	public boolean isWin(){
		 return checkProgress().indexOf('_') == -1;

	}
	


}