package com.bilgeadam.lesson001;

/*
 * iki tane string değişkenimiz olsun isim ve soy ismi bu değişkenlerde tutalım
 * daha sonra bir yaş değişkenimiz olsun yaşımızıda bu değişkende tutalım
 * sizden bunun sonucunda şöyle bir çıktı istiyorum
 * 
 * Mustafa Ozturk - 35
 * 
 * 
 */

public class Question2 {

	public static void main(String[] args) {
		
		String a,b; int c;
		a = "Mustafa";
		b = "Ozturk";
		c = 35;
		
		System.out.println(a+" "+b+" - "+c);
		System.out.println(a+"\n"+b+"\n"+c);   // \n ifadesi alt satıra geçirir
		System.out.println(a+"\t\t\t"+b+"\t"+c);   // \t ifadesi tab boşluğu bırakır
		
		

	}

}
