package com.bilgeadam.lesson004;

/*
 * iki tane sayı değişkenimiz olsun
 * dışarıdan bir işlem seçeceğiz (toplama bölme çıkarma çarpma) (+,/,-,*)
 * dışarıdan seçtiğimiz işleme göre bize o işlemi yapıp sonucu bulsun
 * ve sonunda sonucu yazdıralım
 */

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		
		
		String a = input.nextLine();	    // bunu eklemeyince alttaki nextLine doğru çalışmıyor.
		System.out.print("Bir işlem seçiniz(+,-,*,/): ");
		String islem = input.nextLine();
		
		System.out.print("İkinci sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		switch (islem) {
		case "+":
			System.out.println("Sonuç: "+(sayi1+sayi2));
			break;
		case "-":
			System.out.println("Sonuç: "+(sayi1-sayi2));
			break;
		case "*":
			System.out.println("Sonuç: "+(sayi1*sayi2));
			break;
		case "/":
			System.out.println("Sonuç: "+(sayi1/sayi2));
			break;
		default:
			System.out.println("Yanlış bir seçim yaptınız");
			break;	
		}
	}
}
