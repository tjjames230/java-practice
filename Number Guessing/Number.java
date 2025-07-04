import java.util.Scanner;

public class Number {
	static Scanner scanner = new Scanner(System.in);

	static String getDifficulty() {
		System.out.println("What difficulty would you like to play? Press the corresponding number.");
		System.out.print("1. Easy\n2. Medium\n3. Hard\n");

		int answer = scanner.nextInt();

		while (true) {
			if (answer == 1 || answer == 2 || answer == 3) {
				break;
			} else {
				System.out.println("Invalid input. Press a correct value");
				System.out.println("What difficulty would you like to play? Press the corresponding number.");
				System.out.print("1. Easy\n2. Medium\n3. Hard\n");
				answer = scanner.nextInt();
			}
		}

		switch (answer) {
			case 1:
				return "easy";
			case 2:
				return "medium";
			case 3:
				return "hard";
			default:
				return "easy";
		}
	}

	public static void main(String[] args) {
		String difficulty = getDifficulty();
		Gameflow gameflow = new Gameflow(difficulty);
		gameflow.playGame();
		scanner.close();
	}
}