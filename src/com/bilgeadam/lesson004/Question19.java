package com.bilgeadam.lesson004;

/*
 * 1 den 100 e kadar olan çift sayıların toplamının 
 * tek sayıların toplamına oranı
 * 
 * wrapper class nedir
 * heap bellek stack bellek arasındaki fark nedir
 * referans tur nedir
 */

public class Question19 {

	public static void main(String[] args) {
		
		 int toplamcift = 0;
		 int toplamtek = 0;
		 
		for (int i=1; i<=100; i++) {
			if (i%2==0) {
				toplamcift+=i;
				// System.out.println("kontrol cift toplam son durum: "+toplamcift);
			} else {
				toplamtek+=i;
				// System.out.println("kontrol tek toplam son durum: "+toplamtek);
			}		
		}
		double oran =  (double) toplamcift/toplamtek;
				
		System.out.println("1-100 arasındaki çift sayıların toplamının tek sayıların toplamına oranı: "+oran);
	}
}
