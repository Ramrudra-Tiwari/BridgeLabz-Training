import java.util.Scanner;

public class RockPaperScissorsGame {

	// Method to get computer choice using Math.random()
	public static String getComputerChoice() {
		int choice = (int) (Math.random() * 3);
		if (choice == 0)
			return "rock";
		else if (choice == 1)
			return "paper";
		else
			return "scissors";
	}

	// Method to find winner of a game
	public static String findWinner(String user, String computer) {
		if (user.equals(computer)) {
			return "Draw";
		}

		if ((user.equals("rock") && computer.equals("scissors")) ||
		    (user.equals("paper") && computer.equals("rock")) ||
		    (user.equals("scissors") && computer.equals("paper"))) {
			return "User";
		} else {
			return "Computer";
		}
	}

	// Method to calculate win count and percentages
	public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
		double userPercentage = (userWins * 100.0) / totalGames;
		double computerPercentage = (computerWins * 100.0) / totalGames;

		String[][] stats = new String[2][3];
		stats[0][0] = "User";
		stats[0][1] = String.valueOf(userWins);
		stats[0][2] = String.format("%.2f%%", userPercentage);

		stats[1][0] = "Computer";
		stats[1][1] = String.valueOf(computerWins);
		stats[1][2] = String.format("%.2f%%", computerPercentage);

		return stats;
	}

	// Method to display game results and statistics
	public static void displayResults(String[][] gameResults, String[][] stats) {

		System.out.println("\nGame Results:");
		System.out.println("Game\tUser\tComputer\tWinner");

		for (int i = 0; i < gameResults.length; i++) {
			System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
				gameResults[i][1] + "\t\t" + gameResults[i][2]);
		}

		System.out.println("\nFinal Statistics:");
		System.out.println("Player\tWins\tWinning %");

		for (int i = 0; i < stats.length; i++) {
			System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of games: ");
		int totalGames = sc.nextInt();
		sc.nextLine();

		String[][] gameResults = new String[totalGames][3];

		int userWins = 0;
		int computerWins = 0;

		for (int i = 0; i < totalGames; i++) {
			System.out.print("Enter your choice (rock/paper/scissors): ");
			String userChoice = sc.nextLine().toLowerCase().trim();

			String computerChoice = getComputerChoice();
			String winner = findWinner(userChoice, computerChoice);

			if (winner.equals("User"))
				userWins++;
			else if (winner.equals("Computer"))
				computerWins++;

			gameResults[i][0] = userChoice;
			gameResults[i][1] = computerChoice;
			gameResults[i][2] = winner;
		}

		String[][] stats = calculateStats(userWins, computerWins, totalGames);
		displayResults(gameResults, stats);

		sc.close();
	}
}
