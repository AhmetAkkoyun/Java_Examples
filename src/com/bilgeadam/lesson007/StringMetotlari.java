package com.bilgeadam.lesson007;

public class StringMetotlari {

	public static void main(String[] args) {
		
		String value1 = "Merhaba Dünya";
		String value2 = "Java";
		
		System.out.println(value1.length()); // uzunluk
		System.out.println(value1.charAt(0)); // index değerindeki charı dönüyor
		System.out.println(value1.concat(value2)); // birleştirme işlemi
		System.out.println(value1);
		System.out.println(value2);
		String value3 = value2.concat(value1);
		System.out.println(value3);
		System.out.println(value1+value2);
		
		// index aralığındaki değerleri alma
		System.out.println(value1.substring(5)); 
		System.out.println(value1.substring(4,5));
		System.out.println(value1.substring(1)); 
		System.out.println(value1.substring(7, 9)); 
		System.out.println(value1.substring(5, value1.length())); 
		System.out.println(value1.substring(5, value1.length()-1));
		
		
		
		// içeriyor mu?
		System.out.println(value1.contains("Mer"));
		System.out.println(value1.contains("D"));
		System.out.println(value1.contains(" D"));
		System.out.println(value1.contains(" d"));
		
		// eşitlik kontrolü
		String value4="Merhaba Dünya";
		String value5="merhaba Dünya";
		String value6=new String("Merhaba Dünya");
		String value7=new String("Merhaba Dünya");
		System.out.println(value1.equals(value4));
		System.out.println(value1.equals(value5));
		System.out.println(value1.equalsIgnoreCase(value5));
		System.out.println(value1==value4);
		System.out.println(value1==value6);
		System.out.println(value1.equals(value6));
		System.out.println(value7==value6);
		
		// bir karakterin kaçıncı indexte olduğunu bulan metot
		System.out.println(value1.indexOf("a"));
		System.out.println(value1.lastIndexOf("a"));
		System.out.println(value1.lastIndexOf("a"));
		System.out.println(value1.indexOf("x"));
		
		// Uppercase ve Lowercase 
		System.out.println(value1.toUpperCase());
		value1 = value1.toUpperCase();
		System.out.println(value1);
		System.out.println(value1.toLowerCase());
		// System.out.println(value1.toUpperCase(Locale.ENGLISH));
		System.out.println(value1.substring(0, 3).toUpperCase()+value1.substring(3));
		
		// replace // değiştirme
		System.out.println(value1.replace('a', 'x'));
		System.out.println(value1.replace('a', 'c'));
		System.out.println(value1.replace('x', 'c'));
		
		// startswith endwiths // ile başlıyor mu ile bitiyor mu
		System.out.println(value1.startsWith("M"));
		System.out.println(value1.startsWith("m"));
		System.out.println(value1.endsWith("a"));
		System.out.println(value1.endsWith("m"));
		
		// trim baştaki ve sondaki boşlukları silme
		String value9=" xxx ";
		System.out.println(value9);
		System.out.println(value9.trim());
				
		// split / bölümleme
		String value10= "Java,React,.Net";
		
		String[]dizi = value10.split(",");   // virgülden böldük	
		for (int i=0; i<dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println(dizi[0]);
		
		
		String[]dizi2 = value10.split("a");   // a harfinden böldük	
		for (int i=0; i<dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		System.out.println(dizi2[0]);
		
		// tamamını bölümleme / array yapma
		char[] array = value10.toCharArray();
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
