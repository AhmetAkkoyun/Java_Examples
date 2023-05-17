package com.bilgeadam.lesson004;

/*
 * a dan z ye kadar alfabeyi yazdıralım (döngü kullanarak)
 */

public class Question17 {

	public static void main(String[] args) {
		
		char ilkharf = 'A';
		char sonharf = 'Z';
		
		for (int harf=ilkharf; harf<=sonharf; harf++){
			System.out.print((char)harf);
		}
		
		System.out.print("\n\n--------------\n\n");
		
		while (ilkharf<=sonharf) {
			System.out.print(ilkharf);
			ilkharf++;
		}
	}
}

