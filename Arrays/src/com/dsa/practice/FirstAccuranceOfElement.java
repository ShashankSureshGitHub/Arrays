package com.dsa.practice;

public class FirstAccuranceOfElement {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 3, 4, 5 };
		FirstOccurance(arr, arr.length, 0, 5);

	}

	public static void FirstOccurance(int[] arr, int size, int i, int val) {
		if (i == size) {
			return;
		}
		if (arr[i] == val) {
			System.out.println(val+" found in the position "+i);
			i=size-1;
		}
		FirstOccurance(arr, size, ++i,val);
	}

}
