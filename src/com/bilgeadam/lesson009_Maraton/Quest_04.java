package com.bilgeadam.lesson009_Maraton;

import com.bilgeadam.lesson009_Maraton.CustomStringTR;

public class Quest_04 {

	public static void main(String[] args) {
		
		System.out.println("AHMET AKKOYUN\n");
		
		// CustomStrinTr sınıfı denemeleri
		
		String giris = "Java Maraton01 09.05.2023";  
	    String giris2 = " ahmet  ";
	    String giris3 = "AKKOYUN";
	    
	    CustomStringTR ifade= new CustomStringTR(giris);
	    CustomStringTR ifade2= new CustomStringTR(giris2);
	    CustomStringTR ifade3= new CustomStringTR(giris3);
		
		System.out.println(ifade.uzunluk());               // .length()
		System.out.println(ifade.karakter(8));		       // .charAt()
		System.out.println(ifade2.birlestir(giris3));      // .concat()
		System.out.println(ifade3.aralikDeger(3, 5));      // .substring()
	    System.out.println(ifade.icerirMi("Maraton"));     // .contains()
		System.out.println(ifade2.esitMi("ahmet"));        // .equals()
	    System.out.println(ifade3.ilkKonum('U'));          // .indexOf()
	    System.out.println(ifade.sonKonum('a'));           // .lastIndexOf()
		System.out.println(ifade2.buyut());                // .toUpperCase()
		System.out.println(ifade3.kucult());               // .toLowerCase()
		System.out.println(ifade.degistir('a', 'e'));      // .replace()
	    System.out.println(ifade3.ileBasliyorMu("AK"));    // .startsWith()
	    System.out.println(ifade2.ileBitiyorMu("met  "));  // .endsWith()
		System.out.println(ifade2.kenarlariTemizle());     // .trim()
		System.out.println(ifade.ayir(" "));               // .split()
		
		char[]ifadeDizisi= ifade3.diziYap();               // .toCharArray()
		for (int i=0; i<ifadeDizisi.length; i++) {         
			System.out.println(ifadeDizisi[i]);            
		}
	}
}
