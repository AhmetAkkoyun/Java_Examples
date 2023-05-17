package com.bilgeadam.lesson010;

/*
 * çarpım tablosunu bir arrayin içine toplayacağız
 * 1 ile 10 arasındaki sayılar için geçerli
 */

public class Question50 {
			
	public static void main(String[] args) {
						
		int tablo[][] = carpimTablosuOlustur();
		ikiBoyutluDiziYazdir(tablo);
																
	}

	public static void ikiBoyutluDiziYazdir(int array[][]) {
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print(i+"x"+j+"="+array[i-1][j-1]+"\t");		
			}
			System.out.println("");
		}			
	}

	public static int[][] carpimTablosuOlustur() {		
		
		int [][] dizi = new int[10][10];

		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				dizi[i][j] = (i+1)*(j+1); 			
			}
		}
		return dizi;	
	}	
}
