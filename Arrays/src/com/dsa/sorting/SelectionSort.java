package com.dsa.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min_index = i;
			int temp = 0;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}

	}

	public static void main(String[] args) {
		int[] array = { 20, 12, 24, 56, 14, 56, 98, 1, 9 };
		selectionSort(array);
		System.out.println("Array after insertion sort is");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
