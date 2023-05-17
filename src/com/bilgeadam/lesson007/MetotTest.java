package com.bilgeadam.lesson007;

import javax.sound.midi.SysexMessage;

public class MetotTest {

	public static void main(String[] args) {
		
		String[]array=new String[3];
		String deger="Java";
		int sayi = 1;
		metot1();
		
		metot2(deger, sayi, array);
		System.out.println("main metod===>" + array[1]);
		
		System.out.println(metot3());

		int result = metot3();
		
		System.out.println(result+5);
		
		 String isim = strmetot();
		 
		 System.out.println(isim);
		 
		 System.out.println(metot4(10, 5));
		 
		 int result2 = metot4(12, 18);
	
		 System.out.println(result2);
		 
		 String[]yeniDizi= new String[3];
		 System.out.println(yeniDizi[0]);
		 arrayOlustur(yeniDizi);
		 // System.out.println(arrayOlustur(yeniDizi[0]));
		 System.out.println(yeniDizi[0]);
		 
		 String[]yeniDizi2=arrayOlustur2();
		 System.out.println(yeniDizi2[1]);
		 		

	}
	
// geri dönüşü olmayan parametresiz metod
	public static void metot1() {
		int sayi=5;
		int sayi2=10;
		int sonuc=sayi+sayi2;
		System.out.println(sonuc);
		System.out.println("Metot1 çalışıyor");	
	}
	
// geri dönüşü olmayan parametreli metod
	
	public static void metot2(String kelime, int sayi, String[]dizi) {
		System.out.println("Metot2 çalışıyor");
		dizi[sayi]=kelime;
		System.out.println(sayi);
		System.out.println(dizi[sayi]);		
	}

// geri dönüşlü parametresiz metod
	public static int metot3() {
		int sayi=12;
		int sayi2=13;
		int sonuc=sayi+sayi2;
		System.out.println(sonuc);
		System.out.println("Metot1 çalışıyor");
		// System.out.println(sonuc);
		return sonuc;
	}
	
	public static String strmetot() {
		return "Mustafa";
	}

// geri dönüşlü parametreli metod
	public static int metot4(int sayi1, int sayi2) {
		System.out.println("Metot4 çalışıyor");	
		sayi1 = sayi1/2;
		double sayi3 = 50;
		return(int)(sayi3-sayi1-sayi2);

	}
	
	//
	
	public static String[] arrayOlustur(String[]dizi) {
		// dizi = new String[3];
		dizi[0] = "Html";
		dizi[1] = "Css";
		dizi[2] = "JavaScript";
		return dizi;
	}
	
	public static String[] arrayOlustur2() {
		String[]yeniDizi=new String[4];
		yeniDizi[0] = "Html";
		yeniDizi[1] = "Css";
		yeniDizi[2] = "JavaScript";
		return yeniDizi;
		
	}
	
}
