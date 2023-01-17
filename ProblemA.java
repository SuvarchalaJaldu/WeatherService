package problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProblemA {

	/*
	 * The Program is designed to calculate the total number of days in which the
	 * temperature was below zero degrees Celsius. The program takes the input data
	 * through a Scanner class. The input is composed of two lines. The first line
	 * contains a single positive integer n(1 <= n <= 100) that specifies the number
	 * of temperatures collected by the University of Chicago Weather Service. The
	 * second line contains n temperatures, each separated by a single space. Each
	 * temperature is represented by an integer t(-1000000 <= t <= 1000000).
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tempLessThanZero = 0;
		int t; // t represents temperatures
		int n; // Here n represents number of temperatures

		try {
			n = sc.nextInt();
			String[] FirstInputLine = sc.nextLine().split(" ");
			if ((FirstInputLine.length != 1) || (n < 1) || (n > 100)) {
				System.err.println("Please give only single integer in the range 1 to 100");
				System.exit(0);
			}

			String[] temperaturesList = sc.nextLine().split(" ");
			if (temperaturesList.length != n) {
				System.err.println("Please check the given temperature values.");
				System.exit(0);
			}

			for (String temperature : temperaturesList) {
				t = Integer.parseInt(temperature);
				if ((t < -1000000) || (t > 100000)) {
					System.err.println("One or more Provided temperatures are not in accepted range...");
					System.exit(0);
				}
				if (t < 0)
					tempLessThanZero++;
			}
		} catch (InputMismatchException | NumberFormatException e) {
			System.err.println("Please enter only integer values !!");
			System.exit(0);
		}
		sc.close();
		System.out.println(tempLessThanZero);
	}

}
