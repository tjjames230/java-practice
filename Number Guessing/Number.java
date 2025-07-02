import java.util.Scanner;
import java.util.Random;

public class Number {
	static Scanner scanner = new Scanner(System.in);

	static String getDifficulty() {
		System.out.println("What difficulty would you like to play? Press the corresponding number.");
		System.out.print("1. Easy\n2. Medium\n3. Hard\n");

		int answer = scanner.nextInt();

		// while (answer != 1 || answer != 2 || answer != 3) {
		// 	System.out.println(answer);
		// 	System.out.println("Invalid input. Press a correct value");
		// 	System.out.println("What difficulty would you like to play? Press the corresponding number.");
		// 	System.out.print("1. Easy\n2. Medium\n3. Hard\n");
		// 	answer = scanner.nextInt();
		// }

		scanner.close();

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
		System.out.println(difficulty);

		Random random = new Random();

		int randomNum = random.nextInt(20);
		System.out.println(randomNum);

		// Scanner scanner = new Scanner(System.in);		
		// System.out.println("What is your name?");
		// String name = scanner.nextLine();
		// System.out.printf("My name is: %s\n", name);
		// scanner.close();
	}
}