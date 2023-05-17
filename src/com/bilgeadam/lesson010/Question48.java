package com.bilgeadam.lesson010;

/*
 * 1 metot yazacağız bu metot bize bu arrayde 1 ve 4 ün kaç kere söyleyecek
 * ayrıca 1 sayısının adeti 4 ten büyük ise true değilse false dönsün
 */

public class Question48 {

	public static void main(String[] args) {
		
		 int [] sayilar = {1,4,5,6,1,1,4,8};		 
		 System.out.println(bak(sayilar,1,4));		 		 
	}
	public static boolean bak(int[] dizi, int sayi1, int sayi2) {	
		int sayac1= 0;
		int sayac2= 0;

		for (int i=0; i<dizi.length; i++) {
			if (dizi[i]==sayi1) sayac1++;
			else if (dizi[i]==sayi2) sayac2++;
			else continue;	
			}
		
		System.out.println(dizi+" dizisi içerisinde "+sayac1+" adet "+sayi1+" bulunmaktadır.");
		System.out.println(dizi+" dizisi içerisinde "+sayac2+" adet "+sayi2+" bulunmaktadır.");
		return sayac1>sayac2;							
	}
}
