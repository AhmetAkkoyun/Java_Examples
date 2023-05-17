package com.bilgeadam.lesson010;
/*
 * bir metot yazalım bu metot çift boyutlu dizimizdeki tek sayıları 
 * başka bir tek boyutlu diziye atsın daha sonra bu diziyi yazdıralım 
 */

public class Question51 {

	public static void main(String[] args) {
		
		int[][]matris = {
				{56,23,678,231,5},
				{234,21,78,26,6},
				{654,33,32,67,2},
				{189,35,56,89,8}};		
		
		int teksayilar[]= tekSayilariBul(matris);
		
		yazdir(teksayilar);		

	}

	public static void yazdir(int[] dizi) {
		System.out.print("[");
		for (int i=0; i<dizi.length; i++) {
			System.out.print(dizi[i]);
			if (i<dizi.length-1) {
				System.out.print(",");	
			}
		}
		System.out.println("]");
	}

	public static int[] tekSayilariBul(int[][]dizi) {
		int sayac = 0;
		for (int i=0; i<dizi.length; i++) {
			for (int j=0; j<dizi[i].length; j++) {
				if (dizi[i][j] % 2 != 0) {
					sayac++;
				}		
			}
		}
		int tekSayilar[] = new int[sayac];
		int k=0;
		while(k<tekSayilar.length) {
			for (int i=0; i<dizi.length; i++) {
				for (int j=0; j<dizi[i].length; j++) {
					if (dizi[i][j] % 2 != 0) {
						tekSayilar[k] = dizi[i][j];
						k++;
					}	
				}				
			}							
		}
		return tekSayilar;				
	}
}
