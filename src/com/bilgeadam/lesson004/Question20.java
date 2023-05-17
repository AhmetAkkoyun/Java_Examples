package com.bilgeadam.lesson004;

/*
 * telefonkod mailkod başlangıç değerlerini kendimiz atayacağız (int)
 * daha sonra dışarıdan bir tane telefon kodu alacağız bir tane de mail için kod alacağız
 * eğer hatalı olan var ise o kodun hatalı olduğunu yazdıracağız. 
 */

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int mailKod = 20;
		int telefonKod = 10;
		
		System.out.print("bir mail kodu giriniz:  ");
		int mKod = input.nextInt();

		System.out.print("bir telefon kodu giriniz:  ");
		int tKod = input.nextInt();
	
		if (mailKod==mKod){
			System.out.println("Mail kodu doğrudur.");
		} else{
			System.out.println("Mail kodu yanlıştır.");
		}
		
		if (telefonKod==tKod){
			System.out.println("Telefon kodu doğrudur.");
		} else{
			System.out.println("Telefon kodu yanlıştır.");
		}
	}
}
