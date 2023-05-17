package com.bilgeadam.lesson006;
/*
 *Stringlere giriş 
 */

public class Question37 {

	public static void main(String[] args) {
		
		String [] dizi = new String[4];
		// String dizi2 [] = new String[7];
		
		dizi[0]="java";
		// dizi[4]="React";
		// System.out.println(dizi[4]);   hata verecektir çünkü 0,1,2,3 değerler var 4 yok.
		dizi[3]="React";
		System.out.println(dizi[3]);
		
    	String [] dizi2= {"Mustafa", "Mert"};    // böyle oluşturulabilir.
    	System.out.println(dizi2[1]);
    	
    	String[] dizi3;     // böyle de oluşturulabilir	
    	dizi3 = new String[2];   // dizinin boyutunu belirledik  
    	dizi3[0]= "Mustafa";  // sonradan eleman ekledik
    	
    	int[]dizi4 = new int[10];
    	System.out.println(dizi4[0]);  // 0 çıkacak. çünkü değer verilmedi. ilk oluştuğunda int değer default 0 atanır
    	System.out.println(dizi[1]); // string olan dizi[1] yukarıda tanımlanmamıştı. bunun da default değeri "null" 
    	
    	Integer[]dizi5 = new Integer[5];
    	System.out.println(dizi5[0]);
    	System.out.println(dizi4[0]);
    	System.out.println(dizi[1]);
    	
    	boolean[] dizi6 = new boolean[5];
    	System.out.println(dizi6[0]);
    	dizi6[1]=true;
    	System.out.println(dizi6[1]);
    	
    	
    	for (int i=1; i<dizi6.length; i++) {
    		System.out.println(dizi6[i]);
    	}	
	}
}
