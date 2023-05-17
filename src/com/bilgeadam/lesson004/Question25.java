package com.bilgeadam.lesson004;

/*
 * Switch case
 */

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		
		
		String boyut = "M"; // S-M-L-XL Pizza boyutlarımız
		
		switch (boyut) {
		case "S": 
			System.out.println("küçük boy pizza seçtiniz");
			break;
		case "M": 
			System.out.println("orta boy pizza seçtiniz");
			break;
		case "L": 
			System.out.println("büyük boy pizza seçtiniz");
			break;
		case "XL": 
			System.out.println("ekstra büyük boy pizza seçtiniz");
			break;		
		default:
			System.out.println("Yanlış bir seçim yaptınız");
			break;
		}
		
		System.out.println("--------------------");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir boyut seçiniz");
		String kelime = scanner.nextLine();
		
		switch (kelime) {
		case "S": 
			System.out.println("küçük boy pizza seçtiniz");
			break;
		case "M": 
			System.out.println("orta boy pizza seçtiniz");
			break;
		case "L": 
			System.out.println("büyük boy pizza seçtiniz");
			break;
		case "XL": 
			System.out.println("ekstra büyük boy pizza seçtiniz");
			break;		
		default:
			System.out.println("Yanlış bir seçim yaptınız");
			break;
		}
		
	}
}
