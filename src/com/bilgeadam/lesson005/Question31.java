package com.bilgeadam.lesson005;

public class Question31 {

	public static void main(String[] args) {
		String kelime = "Java";
		char karakter = kelime.charAt(0);   // ilk harf
		char karakter1 = kelime.charAt(1);  // ikinci harf
		char karakter2 = kelime.charAt(2);  // üçüncü harf
		char karakter3 = kelime.charAt(3);  // dördüncü harf
		
		System.out.println(karakter);
		System.out.println(karakter1);
		System.out.println(karakter2);
		System.out.println(karakter3);
		System.out.println(kelime.length()); // kelime uzunluğu. harf sayısı  
		
		char sonkarakter = kelime.charAt(kelime.length()-1); // son harf için uzunluk-1 çünkü 0 dan başladı.
		System.out.println(sonkarakter);
		int sonIndex = kelime.length()-1;
		char sonkarakter2 = kelime.charAt(sonIndex);
		System.out.println(sonkarakter2);
		
		for (int i=0; i<kelime.length(); i++) {
			System.out.println(i+". indexteki karakter==>"+kelime.charAt(i));			
		}
	}
}
