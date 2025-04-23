package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// find the sum of digits of a number

		System.out.println("Enter a integer number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10; // remove the last digit of number
		}

		System.out.println("The sum of the digits is " + sum);
	}

}
