package package4;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'b', 'd', 'e' };
		System.out.println("Original array: " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	public static void bubbleSort(char[] arr) {
		int n = arr.length;
		boolean swapped;

		do {
			swapped = false;

			for (int i = 1; i < n; i++) {
				if (arr[i - 1] > arr[i]) {
					char temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}

			n--;
		} while (swapped);
	}
}
