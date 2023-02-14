package com.dsa.sorting;

public class QuickSort {

	public static int partition(int[] arr, int low, int high) {

		int swapIndex = low - 1;
		int pivot = arr[high];
		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				swapIndex++;

				int temp = arr[i];
				arr[i] = arr[swapIndex];
		     	arr[swapIndex] = temp;
			}

		}
		int temp=arr[high];
		arr[high]=arr[swapIndex+1];
		arr[swapIndex+1]=temp;
		return swapIndex++;

	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = partition(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}

	}

	public static void main(String[] args) {
		int array[] = { 23, 45, 65, 12, 37, 89, 9 };
		int n = array.length;
		quickSort(array, 0, n - 1);
		System.out.println("Array after quick sorting:");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
