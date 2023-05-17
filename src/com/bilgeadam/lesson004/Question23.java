package com.bilgeadam.lesson004;

/*
 * girilen sayının asal olup olmadığını çıktı olarak yazdır.
 */

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayı giriniz: ");
		int sayi = input.nextInt();
		
		for (int i=2; i<=sayi; i++) {
			if (sayi%i==0) {
				if (i==sayi) {
					System.out.println("sayı asal sayıdır.");
				} else {
					System.out.println("sayı asal sayı değilidr.");
					break;
				}
			}		
		}
	}
}
