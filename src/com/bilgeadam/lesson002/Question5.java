package com.bilgeadam.lesson002;

/*
 * Dışardan veri alma ile ilgili örnekler
 */

import java.util.Scanner;  // kullanıcıdan veri almak için Scanner import edilmeli.

public class Question5 {

	public static void main(String[] args) {
		
	// ===>	Scanner <=== ctrl tuşuna basarak üzerine tıklayınca detaylara ulaşılabilir.
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim=scanner.nextLine();
		
		System.out.println("isim= "+isim);
		
		
	}

}
