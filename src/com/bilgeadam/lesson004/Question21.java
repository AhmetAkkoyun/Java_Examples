package com.bilgeadam.lesson004;

/*
 * telefonkod mailkod başlangıç değerlerini kendimiz atayacağız (int)
 * daha sonra dışarıdan bir tane telefon kodu alacağız bir tane de mail için kod alacağız
 * ikisi de doğru ise sisteme kayıt oldunuz
 * tel doğru mail yanlış ise email hatalıdır
 * mail doğru tel yanlış ise telefon hatalıdır
 * ikisi de yanlış ise telefon ve mail hatalıdır 
 * şeklinde ekrana yazdır.
 */

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int mailKod = 20;
		int telefonKod = 10;
		
		System.out.print("bir mail kodu giriniz:  ");
		int mKod = input.nextInt();

		System.out.print("bir telefon kodu giriniz:  ");
		int tKod = input.nextInt();

		if (mailKod==mKod && telefonKod==tKod) {
			System.out.println("Sisteme kayıt oldunuz.");
		} else if (mailKod==mKod) {
			System.out.println("Telefon kodu hatalıdır.");
		} else if (telefonKod==tKod) {
			System.out.println("Mail kodu hatalıdır.");
		} else {
			System.out.println("Telefon ve Mail kodu hatalıdır.");			
		}
	}
}
