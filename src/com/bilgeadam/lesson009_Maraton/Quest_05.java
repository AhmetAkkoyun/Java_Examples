package com.bilgeadam.lesson009_Maraton;

/*
		Soru 5. (35p) Geometrik hesaplamalar yapan programı yazınız. 
		
		Program aşağıdaki gibi bir menüsü olacak ve aşağıdaki işlevleri yapacaktır: 
		
		* * * * Geometrik Hesaplayıcı * * * * 
		1. Kare alan hesaplama 
		2. Kare çevre hesaplama 
		3. Dikdörtgen alan hesaplama 
		4. Dikdörtgen çevre hesaplama 
		5. Daire alan hesaplama 
		6. Daire Çevre hesaplama 
		7. Çıkış
		
		Kullanıcı çıkışa basmadığı sürece program bu menüyü her işlemden sonra ekrana getirecektir.
		
		Kullanıcı: 
		
		1. Kare alan hesaplamaya basarsa: 
		   Kullanıcıya karenin bir kenarının uzunluğunu girmesi istenecek ve 
		   daha sonra kullanıcıya karenin alanını hesaplayıp gösterecektir.
		
		2. Kare çevre hesaplamaya basarsa: 
		   Kullanıcıya karenin bir kenarının uzunluğunu girmesi istenecek ve 
		   daha sonra kullanıcıya karenin çevresini hesaplayıp gösterecektir.
		
		3. Dikdörtgen alan hesaplamaya basarsa: 
		   Kullanıcıya Dikdörtgen bir kısa ve uzun kenarlarının uzunluğunu 
		   girmesi istenecek ve daha sonra kullanıcıya Dikdörtgen alanını 
		   hesaplayıp gösterecektir.
		
		4. Dikdörtgen çevre hesaplamaya basarsa: 
		   Kullanıcıya Dikdörtgen bir kısa ve uzun kenarlarının uzunluğunu 
		   girmesi istenecek ve daha sonra kullanıcıya Dikdörtgen çevresini 
		   hesaplayıp gösterecektir.
		
		5. Daire alan hesaplamaya basarsa: 
		   Kullanıcıya dairenin yarıçapını girmesi istenecek ve daha sonra 
		   kullanıcıya dairenin alanını hesaplayıp gösterecektir.
		
		6. Daire çevre hesaplamaya basarsa: 
		   Kullanıcıya dairenin yarıçapını girmesi istenecek ve daha sonra 
		   kullanıcıya dairenin çevresini hesaplayıp gösterecektir.
		
		7. Çıkış: 
		   Programdan çıkılacaktır.
 */

import java.util.Scanner;

public class Quest_05 {

	public static void main(String[] args) {
		
		System.out.println("AHMET AKKOYUN\n");

		geometrikHesaplayici();

	}

	public static void menu() {
		System.out.println("=====GEOMETRİK HESAPLAYICI=====");
		System.out.println("|1| Kare Alan Hesaplama");
		System.out.println("|2| Kare Çevre Hesaplama");
		System.out.println("|3| Dikdörtgen Alan Hesaplama");
		System.out.println("|4| Dikdörtgen Çevre Hesaplama");
		System.out.println("|5| Daire Alan Hesaplama");
		System.out.println("|6| Daire Çevre Hesaplama");
		System.out.println("|7| Çıkış");
		System.out.print("\nLütfen menüden bir seçim yapınız: ");

	}

	public static void geometrikHesaplayici() {
		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				System.out.println("\n-----Kare Alan Hesaplama-----");
				kareAlanHesapla();
				islemTamam();
				break;
			case 2:
				System.out.println("\n-----Kare Çevre Hesaplama-----");
				kareCevreHesapla();
				islemTamam();
				break;
			case 3:
				System.out.println("\n-----Dikdörtgen Alan Hesaplama-----");
				dikdortgenAlanHesapla();
				islemTamam();
				break;
			case 4:
				System.out.println("\n-----Dikdörtgen Çevre Hesaplama-----");
				dikdortgenCevreHesapla();
				islemTamam();
				break;
			case 5:
				System.out.println("\n-----Daire Alan Hesaplama-----");
				daireAlanHesapla();
				islemTamam();
				break;
			case 6:
				System.out.println("\n-----Daire Çevre Hesaplama-----");
				daireCevreHesapla();
				islemTamam();
				break;
			case 7:
				System.out.println("\n=====ÇIKIŞ YAPILDI=====");
				break;
			default:
				System.out.println("\n!!! YANLIŞ BİR SEÇİM YAPILDI !!!");
				System.out.println("Yeniden yönlendiriliyor...\n");
				break;
			}

		} while (islem != 7);

	}

	public static void kareAlanHesapla() {
		double kenar = veriAl("lütfen kenar uzunluğunu giriniz");
		System.out.println("Karenin alanı = "+(kenar*kenar));
	}

	public static void kareCevreHesapla() {
		double kenar = veriAl("lütfen kenar uzunluğunu giriniz");
		System.out.println("Karenin çevresi = "+(kenar*4));	
	}

	public static void dikdortgenAlanHesapla() {
		double kenarEn = veriAl("lütfen en uzunluğunu giriniz");
		double kenarBoy = veriAl("lütfen boy uzunluğunu giriniz");
		System.out.println("Dikdörtgenin alanı = "+(kenarEn*kenarBoy));
	}

	public static void dikdortgenCevreHesapla() {
		double kenarEn = veriAl("lütfen en uzunluğunu giriniz");
		double kenarBoy = veriAl("lütfen boy uzunluğunu giriniz");
		System.out.println("Dikdörtgenin çevresi = "+((kenarEn+kenarBoy)*2));
	}

	public static void daireAlanHesapla() {
		double yaricap = veriAl("lütfen yarıçap uzunluğunu giriniz");
		System.out.println("Dairenin alanı = "+(3.14*yaricap*yaricap));
	}

	public static void daireCevreHesapla() {
		double yaricap = veriAl("lütfen kenar uzunluğunu giriniz");
		System.out.println("Dairenin çevresi = "+(3.14*2*yaricap));
	}
	
	public static double veriAl(String mesaj) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(mesaj+": ");
		double veri = scanner.nextInt();
		return veri;
	}
	
	public static void islemTamam() {
		System.out.println("-----İşlem Tamamlandı-----\n");
		System.out.println("Yeniden yönlendiriliyor...\n");	
	}
}