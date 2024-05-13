package package1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sequence of numbers separated by spaces: ");
		String[] numberStrings = scanner.nextLine().split(" ");
		int[] numbers = new int[numberStrings.length];
		for (int i = 0; i < numberStrings.length; i++) {
			numbers[i] = Integer.parseInt(numberStrings[i]);
		}

		System.out.print("Enter a number to search in the array: ");
		int searchNumber = scanner.nextInt();

		int count = 0;

		for (int num : numbers) {
			if (num == searchNumber) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("The number " + searchNumber + " appears " + count + " time(s) in the array.");
		} else {
			System.out.println("The number " + searchNumber + " is not present in the array.");
		}
	}
}
