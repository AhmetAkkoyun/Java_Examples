package com.bilgeadam.lesson003;

/*
 * 1 den girdiğimiz sayıya kadar olan sayıların 
 * toplamını ekrana yazdıran program
 */

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		// for ile
		System.out.println("FOR DÖNGÜSÜ İLE ÇÖZÜM"); 
		
		
		System.out.print("bir sayi giriniz: ");  
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		
		
		for (int i=1; i<=sayi; i++) {
			toplam+=i;			
		}
		
		System.out.println(sayi+" sayısına kadar olan sayıların toplamı: "+toplam);
		
		
		System.out.println("------------------------------");
		
		
		// while ile

		System.out.println("WHILE DÖNGÜSÜ İLE ÇÖZÜM");
				
		System.out.print("bir sayi giriniz: ");  
		int sayii = scanner.nextInt();
		int toplamm = 0;
		int i = 1;
		
		while (i<=sayii) {
			toplamm+=i;
			i++;
		}
		
		System.out.println(sayii+" sayısına kadar olan sayıların toplamı: "+toplamm);		
		
	}

}
