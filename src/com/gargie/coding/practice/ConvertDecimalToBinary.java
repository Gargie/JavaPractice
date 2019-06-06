package com.gargie.coding.practice;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void decimalToBinary(int n) {

		System.out.println("Decimal Number::" + n);
		int arr[] = new int[1000];
		int rem;
		int i = 0;
		while (n > 0) {
			rem = n % 2;
			n = n / 2;
			arr[i] = rem;
			i++;
		}

		System.out.print("Binary Converted Value::");
		for (int y = (i - 1); y >= 0; y--)
			System.out.print(arr[y]);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		decimalToBinary(n);

		scn.close();
	}
}
