package com.bilgeadam.lesson010;

/*
 * Bir başlangıç. ve bitiş değeri arasındaki sıralı sayılardan 
 * eğer sayı 3ün katı ise bilge 5in katı ise adam hem 3ün hem de 
 * 5in katı ise bilgeadam yazdıralım 
 * int start2; int end 22;
 * çıktı:
 * [2,bilge,4,adam,bilge,7........14,bilgeadam,........bilge.22]
 */

public class Question49 {

	public static void main(String[] args) {
		
		diziYazdir(bilgeAdam(2,22));		

	}

	public static void diziYazdir(String[]dizi) {
		System.out.print("[");
		for (String i: dizi) {
			System.out.print(i+",");
		}
		System.out.println("]");			
	}

	public static String[] bilgeAdam(int start, int end) {
		String [] dizi = new String[end-start+1];
				
		for (int i=0; i<dizi.length; i++) {				
			if (start%3==0 && start%5==0) { 
				dizi[i]="bilgeadam";
			}
			else if (start%3==0) {
				dizi[i]="bilge";
			}
			else if (start%5==0 ) {
				dizi[i]="adam";
			}
			else { 
				dizi[i] = String.valueOf(start);
			}
			start++;
		}
		return dizi;	
	}
}
