package com.bilgeadam.lesson003;

/*
 * Dışarıdan girilen bir sayının faktöriyelini hesaplayalım
 */

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");  
		int sayi = input.nextInt();
		int carpim = 1;
		for (int i=1; i<=sayi; i++) {
			carpim = carpim*i;
		}
		System.out.println(sayi+" sayısının faktöriyeli: "+carpim);

	}

}
