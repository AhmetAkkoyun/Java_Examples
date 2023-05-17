package com.bilgeadam.lesson003;

/*
 * 1 den girdiğimiz sayıya kadar olan çift sayıların toplamı
 */

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");  
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		for (int i=2; i<=sayi; i+=2) {
			toplam+=i;			
		}
		
		System.out.println(sayi+" sayısına kadar olan çift sayıların toplamı: "+toplam);
		
		
		// if kullanarak
		
		for (int i=1; i<=sayi; i++) {
			int a = i%2==0?i:0;
			toplam+=a;
				
		}
		
		System.out.println(sayi+" sayısına kadar olan çift sayıların toplamı: "+toplam);
		
		
		
		scanner.close();
		

	}

}
