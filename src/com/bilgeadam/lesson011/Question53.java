package com.bilgeadam.lesson011;

/*
 * 2-Türkçe karakterleri inglizce karakterler çevirme
 * 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' 
 * bir metot ile bu işlemi yapalım  metot içerisinde dışarıdan bir kelime alacagız 
 * bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ve geri döneceğiz;
 * busoruyu çözerkenarraylerkullanabilirsiniz ve string metotlarından yardım alabilirsiniz? 
 * Örnek çıktı Şeker➔Seker gibi çalı➔cali gibi
 */

public class Question53 {

	public static void main(String[] args) {	
		System.out.println("Ahmet Akkoyun\n");				
		
		String icerik= "bir iki üç dört beş altı";
		
		String yeni = karakterCevir(icerik);
		
		yazdir(yeni);
		
	}

	public static void yazdir(String ifade) {
		System.out.println(ifade);		
	}

	public static String karakterCevir(String ifade) {
	
		/*
		ifade = ifade.replace('ç', 'c');
		ifade = ifade.replace('Ç', 'C');
		ifade = ifade.replace('ğ', 'g');
		ifade = ifade.replace('Ğ', 'G');
		ifade = ifade.replace('ı', 'i');
		ifade = ifade.replace('İ', 'ı');
		ifade = ifade.replace('ö', 'o');
		ifade = ifade.replace('Ö', 'O');
		ifade = ifade.replace('ş', 's');
		ifade = ifade.replace('Ş', 'S');
		ifade = ifade.replace('ü', 'u'); 
		ifade = ifade.replace('Ü', 'U'); 
		
		
		/// veya
		char[] trChar = {'ç', 'Ç', 'ğ', 'Ğ', 'ı', 'İ', 'ö', 'Ö', 'ş', 'Ş', 'ü', 'Ü'};
		char[] enChar = {'c', 'C', 'g', 'G', 'i', 'I', 'o', 'O', 's', 'S', 'u', 'U'};
		
		for (int i=0; i<trChar.length; i++) {
			ifade=ifade.replace(trChar[i], enChar[i]);
		}	
		*/
		/// veya
		
		char[][] trEn = {
				{'ç', 'c'}, 
				{'Ç', 'C'}, 
				{'ğ', 'g'}, 
				{'Ğ', 'G'}, 
				{'ı', 'i'}, 
				{'İ', 'I'}, 
				{'ö', 'o'}, 
				{'Ö', 'O'}, 
				{'ş', 's'}, 
				{'Ş', 'S'}, 
				{'ü', 'u'}, 
				{'Ü', 'U'}};
		
		for (int i=0; i<trEn.length; i++) {
			ifade=ifade.replace(trEn[i][0], trEn[i][1]);
		}	
		return ifade;		
	}
}
