package com.bilgeadam.lesson002;

/*
 * Dışardan yarıçap alınarak dairenin alanını ve çevresini hesaplayan program
 */

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Yarıçap: ");
		Double yaricap=scanner.nextDouble();
		
		double alan = (3.14)*yaricap*yaricap;
		double cevre = 2*(3.14)*yaricap;
		
		System.out.println("Dairenin alanı: "+alan);
		System.out.println("Dairenin cevresi: "+cevre);				
	}
}
