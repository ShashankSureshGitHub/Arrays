package com.dsa.practice;

import java.util.Scanner;

public class FrequencyOfElementsInAnArray {

	public static void frequency(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			int count = 0;

			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag == true)
				continue;
			for (int j = 0; j <= i; j++) {
				if (arr[j] == arr[i]) {
					count += 1;
				}
			}
			System.out.println(arr[i] + " " + count);
		}

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array");
			int n = sc.nextInt();
			System.out.println("Enter the elements one by one");
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("The number of occurances of each element in the array is given by");
			frequency(array);
		}
	}

}
