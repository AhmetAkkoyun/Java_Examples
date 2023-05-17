package com.bilgeadam.lesson007;

/*
 * 1 metot yazalım dışarıdan bir ülke ismi alalım
 * bu ülke ismi dizimizde geçiyor mu onu kontrol edelim
 * ve geçiyorsa konsola girdiğimiz ülke bulundu
 * eğer yoksa girdiğiniz ülke bulunamadı çıktısını verelim.
 */

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] dizi = { "Türkiye", "Moğolistan", "Japonya", "Fransa", "Danimarka" };

		System.out.print("Bir ülke ismi giriniz: ");
		String ulke = input.nextLine();

		ulkebul(dizi, ulke);

	}

	public static void ulkebul(String[] array, String aranan) {
		String a = "bulunamadı";

		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(aranan)) {
				a = "bulundu";
			}
		}
		System.out.println("aradığınız ülke dizinin içinde " + a);
	}
}
