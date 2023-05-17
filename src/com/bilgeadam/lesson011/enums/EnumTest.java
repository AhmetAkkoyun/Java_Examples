package com.bilgeadam.lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {
		
// Stringe çevirme metotları		
		EAylar haziran = EAylar.HAZIRAN;
		String haziranString = EAylar.HAZIRAN.toString();
		String haziranString2 = EAylar.HAZIRAN.name();
						
		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
// Enumun sırasını int değer olarak alma (index alma)
		System.out.println(EAylar.HAZIRAN.ordinal());
		System.out.println(EAylar.TEMMUZ.ordinal());
		System.out.println(EAylar.AGUSTOS.ordinal());
// Bir stringi enuma çevirme
		String ay = "temmuz";
		
		EAylar enumAy = EAylar.valueOf(ay.toUpperCase());
		System.out.println(enumAy);
// Bir enum yapısını array a çevirme
		EAylar[] dizi = EAylar.values();
		System.out.println("======================");
		for (EAylar x : dizi) {
			System.out.println(x);
		}
		for (EAylar x : dizi) {
			System.out.println((x.ordinal()+1)+"-"+x.toString());   // x.ordinal() indexi verir. index 0 dan başlar.
		}
// gün sayısı 30 olanları yazdır
		System.out.println("======================");
		for(EAylar a:dizi) {
			if(a.gun==30) {
				System.out.println((a.ordinal()+1)+"-"+a.toString());
			}
		}
// gün sayısı 30 olan yaz aylarını yazdır
		System.out.println("======================");
		for(EAylar a:dizi) {
			if(a.gun==30 && a.mevsim.equalsIgnoreCase("yaz")) {     // stringlerde == yerine equals kullan karışıklık olmasın.
				System.out.println((a.ordinal()+1)+"-"+a.toString());
				System.out.println(a.mevsimGetir());
			}
		}		
		
	}
}
