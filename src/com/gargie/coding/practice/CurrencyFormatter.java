package com.gargie.coding.practice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat usCurr = NumberFormat.getCurrencyInstance(Locale.US);
		String us = usCurr.format(payment);
		NumberFormat indiaCurr = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		String india = indiaCurr.format(payment);
		NumberFormat chinaCurr = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = chinaCurr.format(payment);
		NumberFormat franceCurr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = franceCurr.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
