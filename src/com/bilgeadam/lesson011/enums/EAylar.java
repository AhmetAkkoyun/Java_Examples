package com.bilgeadam.lesson011.enums;

public enum EAylar{
	HAZIRAN(30,"yaz"), TEMMUZ(31,"yaz"), AGUSTOS(31,"yaz"), EYLÜL(30,"sonbahar"), EKİM(31,"sonbahar"), 
	KASIM(30,"sonbahar"), ARALIK(31,"kış");
	
	int gun;
	String mevsim;
	
	EAylar(int i,String deger){                // bunu metot gibi düşün EAylar(30); şeklinde değil HAZIRAN(30); şeklinde çağrılıyor.
		gun=i;
		mevsim = deger;
	}
	
	public String mevsimGetir() {
		return mevsim.toUpperCase();
	}

}
