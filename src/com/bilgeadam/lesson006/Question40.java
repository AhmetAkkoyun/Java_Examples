package com.bilgeadam.lesson006;

/*
 * sayılar dizimizde gezelim
 * tek sayılar toplamının çift sayılar toplamına oranını bulalım.
 */

public class Question40 {

	public static void main(String[] args) {
		
		String[]sayilar= {"4", "6", "5", "12", "13"};				
		
		double tekToplam = 0;
		double ciftToplam = 0;		
		
		for (int i=0; i<sayilar.length; i++) {
			int sayi= Integer.parseInt(sayilar[i]);
			if (sayi%2==0) {
				ciftToplam+=sayi;
			} else {
				tekToplam+=sayi;
			}
		}
		System.out.println(tekToplam);
		System.out.println(ciftToplam);

		double oran = tekToplam/ciftToplam;
		System.out.println("Dizideki tek sayılar toplamının çift sayılar toplamına oranı: "+oran);
	}
}
