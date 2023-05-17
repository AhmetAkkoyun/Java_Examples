package com.bilgeadam.lesson005;

/*
 * Girilen sayının 5in kuvveti olup olmadığını bulan kod
 */

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("lütfen bir sayı giriniz: ");
		double sayi = input.nextDouble();
		
		while (sayi>=5) {
			sayi=sayi/5;
		}
		if (sayi==1) {
			System.out.println("sayı 5'in kuvvetidir.");
		} else {
			System.out.println("sayı 5'in kuvveti değildir.");
		}
	}
}
