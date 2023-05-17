package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dışarıdan vize ve final bilgisi girilsin
 * daha sonra öğrenci ismi girilsin
 * çıktı olarak eğer ortalama 60ın üzerinde ise mustafa adlı öğrenci geçti çıktısı 
 * altında ise mustafa adlı öğrenci kaldı çıktısını verelim
 * 
 * ort=vizenin yüzde 40 finalin yüzde 60 değeri olacak
 */

public class Question8 {

	public static void main(String[] args) {
		
		int vizenot, finalnot;
		double ort;
		String isim; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("öğrenci ismini giriniz");  
		isim = scanner.nextLine();    // bu string değerini başta aldığımız için üzerine scanner.nextLine(); eklememize gerek yok.
		
		System.out.println(isim+" isimli öğrencinin vize notunu giriniz");
		vizenot = scanner.nextInt();
		
		System.out.println(isim+" isimli öğrencinin final notunu giriniz");
		finalnot = scanner.nextInt();
		
		ort = (vizenot*0.4)+(finalnot*0.6);
		System.out.println(isim+" isimli öğrencinin ortalaması: "+ort);
		
		boolean sonuc = ort>=60;
		System.out.println(sonuc?"Öğrenci başarılı":"Öğrenci başarısız");
		
	}

}
