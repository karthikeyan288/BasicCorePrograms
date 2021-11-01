package com.BasicPrograms.ext;

import java.util.Scanner;

public class CheckAlphabetOrVowel {
	public static void main(String[] args) {
		Scanner givenletter=new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		String alphabet= givenletter.nextLine();
		switch (alphabet) {
		case "a":
			System.out.println("The " +alphabet+ " is an Vowel");
			break;
		case "e":
			System.out.println("The " +alphabet+ " is an Vowel");
			break;
		case "i":
			System.out.println("The " +alphabet+ " is an Vowel");
			break;
		case "o":
			System.out.println("The " +alphabet+ " is an Vowel");
			break;
		case "u":
			System.out.println("The " +alphabet+ " is an Vowel");
			break;	
		default:
			System.out.println("The "+alphabet+ " is an Alphabet");
			break;
		}
		
	}

}
