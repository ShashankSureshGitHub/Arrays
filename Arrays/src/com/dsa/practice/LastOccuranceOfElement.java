package com.dsa.practice;

public class LastOccuranceOfElement {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 3, 4, 5 };
		LastOccurance(arr, arr.length, 0, 5);

	}

	public static void LastOccurance(int[] arr, int size, int i, int val) {
		if (i == size) {
			return;
		}
		if (arr[size - i - 1] == val) {
			System.out.println(val + " found in the location " + (size-1));
			i = size;
		}
		LastOccurance(arr, size, ++i, val);

	}
}
