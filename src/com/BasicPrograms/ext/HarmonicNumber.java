package com.BasicPrograms.ext;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		int demo = 1;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = value.nextInt();
		System.out.println("The harmonic number till " + number + " is :");
		for (int i = 1; i <= number; i++) {
			System.out.print(demo + "/" + i + " + ");
		}

	}

}
