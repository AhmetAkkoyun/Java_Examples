package com.bilgeadam.lesson011;

import java.util.Arrays;

public class Question56 {

	public static void main(String[] args) {
		int[]dizi = { 36, 5, 4, 7, 87, 96, 125 };
		
		Arrays.sort(dizi);   // küçükten büyüğe sıralama metodu
		
		for (int i : dizi) {
			System.out.println(i);
			
		}
		
		int[] dizi2 = new int[5];
		Arrays.fill(dizi2,10);      // diziyi 10 sayısı ile doldurdu. boş olmayan dizilerde de elemanları 10 ile değiştirir.
		
		for (int i : dizi2) {
			System.out.println(i);
		}
		
		int[][]dizi3=new int[5][5];
		for (int[] is : dizi3) {
			Arrays.fill(is, 55);
		}
		for(int[] is: dizi3) {
			for (int is2: is) {
				System.out.println(is2);
			}
		}
		
		int[]dizi4 = { 36, 5, 4, 7, 87, 96, 125 };
		int[]dizi5 = { 36, 5, 4, 7, 87, 96, 125 };
		System.out.println(Arrays.equals(dizi4, dizi5));  // true
		System.out.println(dizi4 == dizi5);               // false
		
		System.out.println(Arrays.toString(dizi5));
		
		int[] dizi6 = dizi5.clone();
		System.out.println(Arrays.equals(dizi5, dizi6));
		System.out.println(dizi5==dizi6);   
		
		
		// dizideki bir elemanın yeri
		Arrays.sort(dizi5);                             // sort ile sıralamadan doğru sonuç verilmeyebilir.                       
		int deger = Arrays.binarySearch(dizi5, 36);   
		System.out.println(deger);

	}

}
