package com.BasicPrograms.ext;

import java.util.Scanner;

public class OuotientAndReminder {
	public static void main(String[] args) {
		int dividend ,divisor ;
		Scanner number= new Scanner(System.in);
		 System.out.println(" Enter the  Dividend  : ");
		 dividend=number.nextInt();
		 System.out.println(" Enter the  Divisor  : ");
		 divisor=number.nextInt();
		 int Reminder =dividend % divisor;
		 int Quotient=dividend / divisor;
		 System.out.println("The REMINDER  is " +Reminder);
		 System.out.println("The QUOTIENT  is " +Quotient);
	}

}
