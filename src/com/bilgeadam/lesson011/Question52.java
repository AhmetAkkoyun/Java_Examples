package com.bilgeadam.lesson011;

/*
 * 
 * 1-String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;
 *            06-Ankara;"+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
 * Yukarıdaki string değerini bir metoda verip metotda işlemlere sokarak plakalarıyla 
 * berber bir array içine atayıp daha sonra o arrayi yazdırıken yerlerini değiştirek 
 * yazınız tekrar eden örüntüleredikkat ediniz string metotlarından yardım alınız?
 * Çıktı olarak aşağıdaki ornek çıktıyı istiyorum 
 * Adananın plaka kodu= 01
 * Adıyamannın plaka kodu= 02
 * Afyonkarahisarnın plaka kodu= 03
 * Ağrının plaka kodu= 04
 * Amasyanın plaka kodu= 05
 * Ankaranın plaka kodu= 06
 * Antalyanın plaka kodu= 07
 * Artvinnın plaka kodu= 08
 * Aydınnın plaka kodu= 09
 * Balıkesirnın plaka kodu= 10
 * Konyanın plaka kodu= 42
 */

public class Question52 {

	public static void main(String[] args) {
		System.out.println("Ahmet Akkoyun\n");		
		
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"+"07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
	
		yazdir(duzenle(sehirler));
		
	}
	
	public static void yazdir(String[] dizi) {
		for (int i=0; i<dizi.length; i++) {
			System.out.println(dizi[i]);
		}		
	}

	public static String[] duzenle(String sehirler) {
		
		String [] dizi = sehirler.split(";");
		String sehir, plaka;
		
		for (int i=0; i<dizi.length; i++) {
			sehir = dizi[i].split("-")[1];
			plaka = dizi[i].split("-")[0];
			dizi[i] = sehir+" plaka kodu: "+plaka;
		}
		return dizi;
	}
}
