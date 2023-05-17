package com.bilgeadam.lesson008;

/*
 * bir dizide ard arda gelen 2 değerde 2 rakamı ise bize true donen bir metot yazın
 */
public class Question44 {

	public static void main(String[] args) {
		int [] sayilar = {1,2,4,5,8,2,4,15,2,2};
		
		System.out.println(kontrol(sayilar, 2));			
	}

	public static boolean kontrol(int array[], int sayi) {
		
		for (int i=1; i<(array.length); i++) {
			if (array[i]==array[i-1] && array[i]==sayi) {
				return true;
			}
		}
		return false;		
	}
}
