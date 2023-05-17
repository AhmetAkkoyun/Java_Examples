package com.bilgeadam.lesson006;

/*
 * dizideki en büyük ve en küçük elemanı bulan algoritmayı yazın
 */

public class Question38 {

	public static void main(String[] args) {
		
		int[] sayilar = {1259, 0, 12, 5, 85, -89, 1258, 87, 14};		
		int min = sayilar[0];  //Integer.MAX_VALUE;    bu da olur
		int max = sayilar[0];  //Integer.MIN_VALUE;    bu da olur
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > max) {
				max=sayilar[i];
			}
			if (sayilar[i]<min) {
				min=sayilar[i];
			}
		}		
		System.out.println("max= "+max);
		System.out.println("min= "+min);
	}
}
