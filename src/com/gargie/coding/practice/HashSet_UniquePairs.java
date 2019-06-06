package com.gargie.coding.practice;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_UniquePairs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		s.close();
		HashSet<String> hs = new HashSet<>();
		int count = 0;
		for (int j = 0; j < pair_right.length; j++) {
			boolean b;
			b = hs.add(pair_left[j] + " " + pair_right[j]);

			if (b)
				count = count + 1;

			System.out.println(count);

		}

	}
}