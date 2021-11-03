package com.FuctionalPrograming.ext;

import java.util.Scanner;

public class QuadraticFrom {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=value.nextInt();
		System.out.println("Enter the value of a: ");
		int b=value.nextInt();
		System.out.println("Enter the value of a: ");
		int c=value.nextInt();
		int delta= b*b - 4*a*c;
	    int squareroot =  (int)Math.sqrt(delta);
        int root1 = (-b + squareroot) / 2*a;
	    int root2 = (-b - squareroot) / 2*a;
	    System.out.println("The root 1 is : "+root1);
	    System.out.println("The root 2 is : "+root2);
	}

}
