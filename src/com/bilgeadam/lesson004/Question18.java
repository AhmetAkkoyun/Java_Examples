package com.bilgeadam.lesson004;

/*
 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
 * 0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
 */

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		int toplam = 0;
		int sayac = 0;
		double ort = 0;
		
		while (sayi!=0) {
			ort = (sayac*ort+sayi)/(sayac+1);
			toplam+=sayi;
			sayac++;
			System.out.print("sayı giriniz: ");
			sayi = input.nextInt();
		}
		System.out.println("girilen sayıların toplamı: "+toplam);
		System.out.println("girilen sayıların ortalaması: "+ort);
	}
}