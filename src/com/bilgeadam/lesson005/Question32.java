package com.bilgeadam.lesson005;

/*
 * Dışarıdan bir kelime girelim
 * bu kelime içerisinde küçük a
 * kaç defa geçiyo bize söylesin
 */

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir kelime girin: ");  
		String kelime = input.nextLine();
		int sayac = 0;
		
		for (int i=0; i<(kelime.length()); i++) {
			char harf = kelime.charAt(i);
			if (harf=='a' || harf=='A') {
				sayac++;
			}
		}
		System.out.println(kelime+" kelimesinde "+sayac+" adet a harfi bulunmaktadır.");
	}
}
