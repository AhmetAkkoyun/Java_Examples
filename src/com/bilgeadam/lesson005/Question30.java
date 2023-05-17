package com.bilgeadam.lesson005;

/*
 * klavyeden 0 ile 100 arası 100 de dahil girilen 5 adet sayıdan 
 * en büyük ve en küçük olanını bulup ekrana yazdıran programın kodu 
 */

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		
		int sayimin = 100;
		int sayimax = 1;	
		
		for (int i=1; i<=5; i++) {
			
			int sayi=0;
			
			while (sayi<1 || sayi>100) {                                              
				Scanner input = new Scanner(System.in);
				System.out.print("1-100 arası bir sayi giriniz: ");  
				sayi = input.nextInt();
				if (sayi>0 && sayi<=100) {
					break;
				} else {
					System.err.println("girilen sayi 1-100 araliginda degil!!");
				}
			}
			
			if (sayi<sayimin) {
				sayimin = sayi;
			} else if (sayi>sayimax) {
				sayimax = sayi;
			}			
		}
		
		System.out.println("en küçük sayı: "+sayimin);
		System.out.println("en büyük sayı: "+sayimax);		
	}
}
