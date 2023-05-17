package com.bilgeadam.lesson004;
/* 
 * Dışarıdan taban değeri ve üs değeri alacağız
 * (2 üzeri 5 gibi) bu işlemin sonucu bulan algoritma(döngü ile)
 */

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		System.out.println("---ÜS ALMA İŞLEMİ---");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("taban için pozitif tamsayı değeri giriniz: ");
		int taban = input.nextInt();
		System.out.print("üs için pozitif tamsayı değeri giriniz: ");
		int us = input.nextInt();
		int sonuc = 1;
		
		for (int i=1; i<=us; i++) {
			sonuc*=taban;
		}
		System.out.println("işlem sonucu: "+sonuc);
		
		
		
		System.out.println("\n-------------\n\n\n");
		
			
		System.out.println("---ÜS ALMA İŞLEMİ (ONDALIKLI TABAN VE NEGATİF ÜS)---");
		
		System.out.print("bir taban değeri giriniz: ");
		double taban2 = input.nextDouble();
		
		System.out.print("üs için bir tamsayı değeri giriniz: ");
		double us2 = input.nextDouble();
		if (us2*10!= (int)us2*10) {
			us2 = (int)us2;
			System.err.println("üs değeri tamsayı girilmedi!");
			System.out.println("üs değeri "+us2+" olarak kabul edildi.");
		}
		
		double sonuc2 = 1;
		
		if (us2>=0) {
			for (int i=1; i<=us2; i++) {
				sonuc2*=taban2;
			}	
		} else {
			us2 = -us2;
			for (int i=1; i<=us2; i++) {
				sonuc2*=taban2;
			}
			sonuc2 = 1/sonuc2;
		}
				
		System.out.println("işlem sonucu: "+sonuc2);
		
	}
}
