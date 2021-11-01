package com.BasicPrograms.ext;

import java.util.Scanner;

public class SwapTwoNumbers { 
	public static void main(String[] args) {
		int x ,y ,p;
		Scanner value= new Scanner (System.in);
		System.out.println("Enter the value of  x , y ");
		x=value.nextInt();
		y=value.nextInt();
		System.out.println("The value  x = "+x+ " and y = " +y+ " before swap ");
		p = x;
		x = y;
		y = p ;
		
		System.out.println("The value  x = "+x+ "and y = " +y+ " after swap ");
	}

}
