package com.dsa.sorting;

public class MergeSort {
	public static void divide(int[] arr, int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			divide(arr, low, mid);
			divide(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int i = low, k = low, index = low;
		int j = mid + 1;
		int temp[] = new int[20];

		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		if (i > mid) {
			while (j <= high) {
				temp[k] = arr[j];
				k++;
				j++;
			}
		} else {
			while (i <= mid) {
				temp[k] = arr[i];
				k++;
				i++;
			}
		}

		while (index < k) {
			arr[index] = temp[index];
			index++;
		}
	}

	public static void main(String[] args) {
		int array[] = { 10, 30, 20, 40, 50, 70, 60 };
		int n = array.length;
		for (int i : array) {
			System.out.print(i + " ");
		}
		divide(array, 0, n - 1);
		System.out.println("Array after merge sorting:");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
