package com.dsa.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 50, 40, 10, 20, 30 };
		System.out.println("Array before bubble sorting");
		display(array);
		int len = array.length;
		bubbleSort(array, len);
		System.out.println("Array after bubble sorting");
		display(array);
	}

	private static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static void bubbleSort(int[] arr, int len) {

		for (int i = 0; i < len - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}

	}
}
