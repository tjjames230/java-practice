import java.util.Random;

public class Gameflow {
	String difficulty;
	boolean gameOver;
	int randomNum;

	public Gameflow(String difficulty) {
		this.difficulty = difficulty;
		this.gameOver = false;
		this.randomNum = this.setRandomNum();
	}

	public boolean getGameOver() {
		return this.gameOver;
	}

	public void setGameOver(boolean status) {
		this.gameOver = status;
	}

	public int getRandomNum() {
		return this.randomNum;
	}

	public int setRandomNum() {
		Random random = new Random();

		if (this.difficulty == "easy") {
			return random.nextInt(5);
		} else if (this.difficulty == "medium") {
			return random.nextInt(10);
		} else {
			return random.nextInt(15);
		}
	}

	public int numberGuess() {
		System.out.println("Guess what the random number is.");

	}

	// public void playGame() {
	// while (!gameOver) {

	// if () {

	// }

	// }
	// }
}
