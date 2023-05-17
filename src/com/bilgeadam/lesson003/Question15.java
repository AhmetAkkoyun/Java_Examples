package com.bilgeadam.lesson003;

/*
 * Girilen sayının basamakları toplamını
 * ve kaç basamaklı olduğunu yazdıralım
 */

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("bir sayi giriniz: ");  
		int sayi = input.nextInt();
		int girilen= sayi;
		int basamak = 0;
		int toplam = 0;
		
		do {
			int rakam = sayi%10;			
			toplam = toplam + rakam;
			sayi = sayi/10;
			basamak++;
		
		} while (sayi >= 1); 
		
		System.out.println(girilen+" sayısı "+basamak+" basamaklıdır.");
		System.out.println(girilen+" sayısının basamakları toplamı: "+toplam);	
			
		
	}
}
