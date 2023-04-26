package com.bilgeadam.lesson001;

/*
 * Bir ürün fiyaıtnda %18 kdv %15 kar payı olduğunu biliyoruz
 * bu ürünün fiyatı elimizde olsun
 * bu fiyat üzerinden ürünün ham fiyatını ve kdvsiz fiyatını bulalım.
 */

public class Question3 {

	public static void main(String[] args) {
		
		int fiyat = 1000;
		double kdv = 0.18;
		double karpayi = 0.15;
		
		double kdvsiz = fiyat/(1+kdv);
		double ham = kdvsiz/(1+karpayi);
		
		System.out.println("kdvsiz fiyat: " + kdvsiz);
		System.out.println("ham fiyat: " + ham);
		
				

	}

}
