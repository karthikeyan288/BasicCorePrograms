package com.BasicPrograms.ext;

public class CoinFlipPercentage {
	public static void main(String[] args) {
		int total_head =0;
		int total_tail =0;
		int last_total;
		for (int i = 0; i <30; i++) {
		  double random = Math.floor (Math.random()*10) % 2 ;
		if (random==0) {
			System.out.println("you got head");
			total_head+=random+1;
		} else {
	        System.out.println("you got tail");	
	        total_tail+=random;
		}
		
		System.out.println(random);
	}
		System.out.println(total_head);
		System.out.println(total_tail);
		last_total=total_head +total_tail;
		System.out.println(last_total);
		System.out.println("percentage of head is :" +(total_head*100)/last_total +"%");
		System.out.println("percentage of tail is :" +(total_tail*100)/last_total +"%");
 
	}
	
}