package com.bilgeadam.lesson004;

/*
 * girilen sayının asal olup olmadığını çıktı olarak yazdır.
 */

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayı giriniz: ");
		int sayi = input.nextInt();		
		boolean asalmi = true;
		
		if(sayi<2) {
			asalmi = false;
		} else {
			for (int i=2; i<sayi/2; i++) {
				if (sayi%i==0) {
					asalmi = false;
					break;
				}
			}
		}		
		if (asalmi) {
			System.out.println("asal sayıdır");
		} else {
			System.out.println("asal sayı değildir");
		}
	}
}
