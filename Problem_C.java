package problems;

import java.util.Scanner;

public class Problem_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfPlayers = sc.nextInt();
		int numOfFeatures = sc.nextInt();

		if (numOfPlayers < 1 || numOfPlayers > (int) 1e5 || numOfFeatures < 1 || numOfFeatures > 20) {
			System.err.println("Please check the given input values...");
			System.exit(0);
		}

		int[] featuresCountArray = new int[numOfFeatures];
		String featuresOfPlayer;

		for (int player = 0; player < numOfPlayers; player++) {
			featuresOfPlayer = sc.next();
			if ((featuresOfPlayer.length() != numOfFeatures) || (!featuresOfPlayer.matches("[01]+"))) {
				System.err.println("Number of features or feature pattern does not match with the given input...");
				System.exit(0);
			}

			for (int i = 0; i < numOfFeatures; i++) {
				featuresCountArray[i] += Character.getNumericValue(featuresOfPlayer.charAt(i));
			}
		}
		sc.close();
		for (int k = 0; k < numOfFeatures; k++) {
			if (featuresCountArray[k] > (numOfPlayers - featuresCountArray[k]))
				System.out.print("0");
			else
				System.out.print("1");
		}
	}
}