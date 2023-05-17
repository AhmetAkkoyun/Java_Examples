package com.bilgeadam.lesson004;

public class Question22 {

	public static void main(String[] args) {
		
		int toplam = 0;
		
		if (toplam>=0) {
			toplam+=10;
		}
		if (toplam==10) {
			toplam+=5;
		}
		System.out.println(toplam);  // 15
		
		toplam = 0;
		
		if (toplam>=0) {
			toplam+=10;
		} else if (toplam==10) {
			toplam+=5;
		}
		System.out.println(toplam);  // 10 else if olunca farklı çıktı.

	}

}
