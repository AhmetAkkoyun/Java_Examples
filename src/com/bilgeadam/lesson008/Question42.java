package com.bilgeadam.lesson008;

/*
 * 1 metot yazalım. bu metotta split kullanmadan
 * bu ifadeyi virgüllerden bölüp şu çıktıyı elde edelim
 * Java
 * React
 * Spring
 * Google
 */

public class Question42 {

	public static void main(String[] args) {
		
		String ifade = "Java, React, Spring, Google";
		
		ifadeayir(ifade);
		
		System.out.println("----------------------------------");
		
		ifadeayir2(ifade);

		System.out.println("----------------------------------");
		
		ifadeayir3(ifade);	
		System.out.println(ifade);
		

		

	}


	public static void ifadeayir(String ifade) {
		System.out.println("1. metot");
		for (int i=0; i<ifade.length(); i++) {
			if (ifade.charAt(i)==',') {
				System.out.println();     // vigül görünce yazmadan alt satıra geçsin
			} else {
				System.out.print(ifade.charAt(i));  
			} 
		}
	}

	
	public static void ifadeayir2(String ifade) {
		System.out.println("2. metot");
		int index = 0;
		for (int i=0; i<ifade.length(); i++) {
			if (ifade.charAt(i)==',') {
				System.out.print(ifade.substring(0, i));
				index = i + 1;			
			}
		}
		System.out.print(ifade.substring(index));
	}
	

	public static String ifadeayir3(String ifade) {
		System.out.println("3. metot");
		ifade = ifade.replace(",", "\n");
		return ifade;		
	}

}
