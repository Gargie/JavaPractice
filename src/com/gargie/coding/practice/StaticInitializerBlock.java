package com.gargie.coding.practice;

import java.util.Scanner;

public class StaticInitializerBlock {

	static boolean flag = true;
	static int B = 0;
	static int H = 0;

	static {
		Scanner scn = new Scanner(System.in);
		B = scn.nextInt();
		H = scn.nextInt();
		scn.close();

		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
