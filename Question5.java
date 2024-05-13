package package4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Original array: " + Arrays.toString(arr));

		mergeSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr) {
		if (arr.length > 1) {
			int mid = arr.length / 2;

			int[] left = Arrays.copyOfRange(arr, 0, mid);
			int[] right = Arrays.copyOfRange(arr, mid, arr.length);

			mergeSort(left);
			mergeSort(right);

			merge(arr, left, right);
		}
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
