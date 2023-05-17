package com.bilgeadam.lesson005;

/*
 * mükemmel sayıyı bulan algoritmayı yazın
 */


import java.util.Scanner; 
public class Question29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayı giriniz: ");
		int sayi = input.nextInt();
		int toplam = 0;		
		
		for (int i=1; i<=(sayi/2); i++) {
			if (sayi%i == 0) {
				toplam+=i;				
			} else {
				continue;
			}
		}
		
		if (toplam==sayi) {
			System.out.println("mükemmel sayı");			
		} else {
			System.out.println("mükemmel sayı değil");
		}
	}
}
