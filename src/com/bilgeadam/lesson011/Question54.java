package com.bilgeadam.lesson011;

import java.util.Scanner;

/*
 * 3-Hesap makinesi
 * System.out.println("==Hesap makinesi===\n"); 
 * System.out.println("1-Topla");
 * System.out.println("2-Çıkar"); 
 * System.out.println("3-Çarp");
 * System.out.println("4-Böl"); 
 * System.out.println("0-Çıkış");
 * System.out.println("Bir işlem Seçiniz");
 * 
 * bir döngümüz olucak bu döngüde işlem seçeceğiz her bir işlem için bir metot yazıp  
 * her metotda kullanıcıdan = girene kadar sayı almaya devam edeceğiz eğer 
 * kullanıcı = girmiş ise sonucu geri dönceğiz
 */

public class Question54 {

	public static void main(String[] args) {
		System.out.println("Ahmet Akkoyun\n");

		hesapMakinesi();

	}

	public static void menu() {
		System.out.println("=====HESAP MAKİNESİ=====");
		System.out.println("|1| TOPLA");
		System.out.println("|2| ÇIKAR");
		System.out.println("|3| ÇARP");
		System.out.println("|4| BÖL");
		System.out.println("|5| ÇIKIŞ");
		System.out.print("\nBir işlem seçiniz: ");

	}

	public static void hesapMakinesi() {
		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				System.out.println("\n-----TOPLAMA İŞLEMİ-----");
				topla();
				islemTamam();
				break;
			case 2:
				System.out.println("\n-----ÇIKARMA İŞLEMİ-----");
				cikar();
				islemTamam();
				break;
			case 3:
				System.out.println("\n-----ÇARPMA İŞLEMİ-----");
				carp();
				islemTamam();
				break;
			case 4:
				System.out.println("\n-----BÖLME İŞLEMİ-----");
				bol();
				islemTamam();
				break;
			case 5:
				System.out.println("\n-----ÇIKIŞ YAPILDI-----");
				break;
			default:
				System.out.println("\n!!! YANLIŞ BİR SEÇİM YAPILDI !!!");
				System.out.println("Yeniden yönlendiriliyor...\n");
				break;
			}

		} while (islem != 5);

	}

	public static void topla() {
		int toplam = 0;
		String strVeri;
		
		do {
			strVeri = veriAl("sayı giriniz");
			if (strVeri.equals("=")) break;
			toplam = toplam + Integer.valueOf(strVeri);
		}while (true);	
		System.out.println(toplam);
	}

	public static void cikar() {
		String sayiStr = veriAl("eksilecek sayıyı giriniz");
		int sayi = Integer.valueOf(sayiStr);
		String strVeri;
	
		do {
			strVeri = veriAl("sayı giriniz");
			if (strVeri.equals("=")) break;
			sayi = sayi - Integer.valueOf(strVeri);
		}while (true);
		System.out.println(sayi);
	}

	public static void carp() {
		int carpim = 1;
		String strVeri;
		
		do {
			strVeri = veriAl("sayı giriniz");
			if (strVeri.equals("=")) break;
			carpim = carpim * Integer.valueOf(strVeri);
		}while (true);	
		System.out.println(carpim);
	}

	public static void bol() {
		String sayiStr = veriAl("bölünecek sayıyı giriniz");
		double sayi = Integer.valueOf(sayiStr);
		String strVeri;
	
		do {
			strVeri = veriAl("sayı giriniz");
			if (strVeri.equals("=")) break;
			sayi = sayi / Integer.valueOf(strVeri);
		}while (true);
		System.out.println(sayi);
	}


	public static String veriAl(String mesaj) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(mesaj+": ");
		String veri = scanner.next();
		return veri;
	}
	
	public static void islemTamam() {
		System.out.println("-----İşlem Tamamlandı-----\n");
		System.out.println("Yeniden yönlendiriliyor...\n");	
	}
}