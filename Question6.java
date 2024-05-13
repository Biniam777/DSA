package package6;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		int[] array = { 3, 7, 1, 9, 4 };
		System.out.println("Original array: " + Arrays.toString(array));

		int index = 2;
		int[] modifiedArray = deleteElement(array, index);

		if (modifiedArray == array) {
			System.out.println("Invalid index.");
		} else {
			System.out.println("Modified array: " + Arrays.toString(modifiedArray));
		}
	}

	public static int[] deleteElement(int[] array, int index) {
		if (index < 0 || index >= array.length) {
			return array;
		}

		int[] modifiedArray = new int[array.length - 1];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}
			modifiedArray[j++] = array[i];
		}

		return modifiedArray;
	}
}
