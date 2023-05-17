package com.bilgeadam.lesson003;

/*
 * Kullanıcıdan alınan bir sayıya kadar olan çarpım tablosunu yazdıralım
 * Örnek:
 * 
 * 10 a kadar
 * 1x1=1
 * 1x2=2
 * ..
 * 10x10=100
 */

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");  
		int sayi = input.nextInt();
		
		for (int i=1; i<=sayi; i++) {
			System.out.print("\n");
			for (int j=1; j<=sayi; j++) {
				int carpim = i*j;
				System.out.print(" "+i+"x"+j+"="+carpim+" ");		
			}	
		}
	}
}
