package com.bilgeadam.lesson009_Maraton;

/* 
   			Soru 2. (15p) Bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran 
			bir static metod yazınız. Metod parametre olarak int dizisi alacak ve 
			ilk tekrar eden sayıyı bulup ekrana yazdıracaktır. Tekrar eden sayı 
			bulunmazsa “Tekrar eden sayı bulunamamıştır.” yazacaktır.
			
			Örnek Run 1: 
			int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 }; 
			Ekran çıktısı: 7 sayisi 4 kez tekrar ediyor.
			
			Örnek Run 2: 
			int sayiDizisi[] = { 0, 1, 5, 3 }; 
			Ekran çıktısı: Tekrar eden sayı bulunamamıştır.			
 */



public class Quest_02 {

	public static void main(String[] args) {
		
		System.out.println("AHMET AKKOYUN\n");
		
		int sayiDizisi1[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		int sayiDizisi2[] = { 0, 1, 5, 3 };
    
		
    	ilkTekrarEdeniBul(sayiDizisi1);
    	ilkTekrarEdeniBul(sayiDizisi2);
		
	}

	public static void ilkTekrarEdeniBul(int array[]) {
		
		System.out.println("---KONTROL BAŞLATILDI---\n");
		
		System.out.print("kontrol edilecek dizi elemanları: |");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+"|");
		}
		System.out.print("\n");
		
		int sayi = 0;
		int diziUzunlugu= array.length;
	
		for (int i=0; i<diziUzunlugu; i++) {
			for (int j=i+1; j<diziUzunlugu; j++) {
				if (array[i]==array[j]) {				
					sayi = array[i]; 
					diziUzunlugu = 0;
					System.out.println("dizideki ilk tekrar eden sayi bulundu: "+sayi);
				}
			}		
		}
		int sayac = 0;
		for (int i=0; i<array.length; i++) {
			if ( array[i] == sayi) {
				sayac++;
			}			
		}
		if (sayac<2) {
			System.out.println("bu dizide tekrar eden sayı bulunamamıştır.");
		} else {
			System.out.println("bu dizide "+sayi+" sayısı toplam "+sayac+" kere tekrar etmiştir.");
		}
		System.out.println("\n---KONTROL TAMAMLANDI---\n\n");
	}
}
