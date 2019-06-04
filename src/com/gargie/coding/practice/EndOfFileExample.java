package com.gargie.coding.practice;

import java.util.Scanner;

public class EndOfFileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 1;
		while (scn.hasNext()) {
			System.out.println(i + " " + scn.nextLine());
			i++;
		}
		scn.close();

	}
}
