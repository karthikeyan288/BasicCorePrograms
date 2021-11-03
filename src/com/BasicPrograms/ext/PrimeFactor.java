package com.BasicPrograms.ext;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		int x = 0;
		Scanner number = new Scanner(System.in);
		System.out.println(" Enter the  value  :");
		int value = number.nextInt();
		for (int i = 2; i <= value; i++) {
			while (value % i == 0) {
				System.out.print(i + "  ");
				value = value / i;
			}
		}
	}
}
