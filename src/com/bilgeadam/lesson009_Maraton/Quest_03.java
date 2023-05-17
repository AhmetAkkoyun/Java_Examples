package com.bilgeadam.lesson009_Maraton;

import java.util.Scanner;

/* 
		Soru 3. (15p) karakterSayici isimli static bir Java metodu yazınız. 
		Bu metod bir String bir de char değişkenini parametre olarak alacaktır. 
		Fonksiyon paramtre olarak gelen String içindeki yine parametre olarak 
		gelen karakterin sayısını sayıp return edecektir.
		
		Fonksiyonun örnek kullanımı:
		Örnek kullanım 1: 
		karakterSayici("Bugün güzel bir gün", 'g') Şeklinde main içinden çağırıldığında ekrana 3 yazacaktır. 
		
		Örnek kullanım 2: 
		karakterSayici("Bugün güzel bir gün", 'x') Şeklinde main içinden çağırıldığında ekrana 0 yazacaktır. 
 */

import java.util.Scanner;

public class Quest_03 {

	public static void main(String[] args) {
		
		System.out.println("AHMET AKKOYUN\n");
		
		//kontroller
		
		int a = karakterSayici("Bugün güzel bir gün", 'g');		
		System.out.println(">>> harf sayımı yapıldı. sonuç: "+a);
		
		int b = karakterSayici("Bugün güzel bir gün", 'x');		
		System.out.println(">>> harf sayımı yapıldı. sonuç: "+b);

		
		//verileri kullanıcıdan almak istersek
		
		System.out.println("\n\n----------KULLANICI VERİ GİRİŞİ----------\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir şeyler yazın: ");
		String yazi = scanner.nextLine();
		System.out.print("Sayılmasını istediğiniz harfi yazın: ");
		String secim = scanner.nextLine();
		char harf = secim.charAt(0);
				
		System.out.println(">>> harf sayımı yapıldı. sonuç: "+karakterSayici(yazi, harf));	
						
	}

	public static int karakterSayici(String icerik, char karakter) {
		
		System.out.println("\n-----KARAKTER SAYMA BAŞLADI-----");
		
		System.out.println("[ "+icerik+" ] içerisinde kaç adet [ "+karakter+" ] olduğu bulunacak ");
		
		int sayac = 0;
		for (int i=0; i<(icerik.length()); i++) {
			if (karakter==icerik.charAt(i)) {
				sayac++;
			}
		}
		return sayac;		
	}
}
