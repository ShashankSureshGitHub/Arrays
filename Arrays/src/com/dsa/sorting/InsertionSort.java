package com.dsa.sorting;

public class InsertionSort {

	private static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}

	}

	public static void main(String[] args) {
		int[] array = { 20, 12, 24, 56, 14, 56, 98, 1, 9 };
		insertionSort(array);
		System.out.println("Array after insertion sort is");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
