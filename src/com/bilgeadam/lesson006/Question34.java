package com.bilgeadam.lesson006;

/* 
 * değer stringinin karakterleri toplamı kaçtır?
 */

public class Question34 {

	public static void main(String[] args) {
		
		String deger = "1254";
		
		// 1. yöntem
		
		long sayi = Long.parseLong(deger);
		System.out.println(deger);

		long toplam = 0;

		while (sayi>9) {
			toplam = toplam + (sayi%10);
			sayi = sayi/10;
		}
		toplam+=sayi;
		System.out.println("toplam: "+toplam);
		
		// diğer yöntemler
		
		int toplama = 0;
		int toplama2 = 0;
		int toplama3 = 0;
		
		
		for (int i=0; i<deger.length(); i++) {
			char a = deger.charAt(i);
			// ascii tablosunda karşılık gelen int değer
			// örneğin ascii 1 değeri 49dur
			toplama3=a;
			// chardan Stringe çevirme. direk char ı toplarsak 1 için 49 gibi değerler eklenir
			String karakter = String.valueOf(a);
			String karakter2 = Character.toString(a);  // böyle de olur 
			// Stringden inte çevirme
			int sayii = Integer.parseInt(karakter);
			toplama +=sayii;
			
			// karakterden direk int e çevirme de var
			int sayii2 = Character.getNumericValue(a);

			toplama2 +=sayii2;
		}
		System.out.println ("toplam:  "+toplama);		
		System.out.println("toplam:   "+toplama2);
		System.out.println("toplam:    "+toplama3);  // bu ascii değerleri toplamı 
		
	}
}
