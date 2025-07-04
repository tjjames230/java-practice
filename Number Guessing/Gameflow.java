import java.util.Random;
import java.util.Scanner;

public class Gameflow {
	String difficulty;
	boolean gameOver;
	int randomNum;
	Scanner scanner = new Scanner(System.in);

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
			return random.nextInt(6);
		} else if (this.difficulty == "medium") {
			return random.nextInt(11);
		} else {
			return random.nextInt(16);
		}
	}

	public int numberGuess() {
		System.out.println("Guess what the random number is.");

		if (this.difficulty == "easy") {
			System.out.println("(between 1-5)");
		} else if (this.difficulty == "medium") {
			System.out.println("(between 1-10)");
		} else {
			System.out.println("(between 1-15)");
		}

		System.out.println("test");
		int number = scanner.nextInt();
		return number;
	}

	public void playGame() {
		while (!gameOver) {
			int number = numberGuess();

			if (number == this.getRandomNum()) {
				this.setGameOver(true);
				System.out.println("Congrats, you guessed the correct number!");
			} else {
				System.out.println("Incorrect, try again");
			}
		}
	}
}
