package com.bilgeadam.lesson006;

/* 
 * uzunluğu 5 olan bir int dizisi tanımla
 * dışarıdan alınan değerleri bu diziye ata
 * sonra da dizinin elemanlarını yazdır.
 */

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		int[] dizi = new int[5];
		
		for (int i=0; i<dizi.length; i++) {
			System.out.print("sayı girin: ");
			int deger = input.nextInt();
			dizi[i] = deger;	
		}		
		for (int i=0; i<dizi.length; i++) {
			System.out.print(dizi[i]+" ");
		}
	}
}
