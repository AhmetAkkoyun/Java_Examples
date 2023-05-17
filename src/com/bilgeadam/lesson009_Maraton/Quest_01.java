package com.bilgeadam.lesson009_Maraton;

/*
			Soru 1. (10p) Aşağıdaki şekli döngüler kullanarak ekrana çizdiren 
			static metod yazınız ve main içinden bu metodu çağırarak çalıştırınız:
			Programınız çalıştırıldığında konsola aşağıdaki görüntüyü çıkaracaktır:
			
			Program Run: 
			
 			* * * * * * * 
 			* * * * * * * 
 			* * * * * * * 
 			* * * * * * * 
 			* * * * * * 
 			* * * * * 
 			* * * * 
 			* * * 
 			* * 
 			* 
*/

// AHMET AKKOYUN

public class Quest_01 {

	public static void main(String[] args) {
		
		System.out.println("AHMET AKKOYUN\n");
		
		yamukSekilCiz(7,4,"* ");     // istenen şeklin dikdörtgen kısmının en ve boy ölçüleri girilmeli. dikdörtgen kısım bitince dik üçgen otomatik oluşacak.
		                             // "* " yerine farklı karakterler de girilebilir.
	}

	public static void yamukSekilCiz(int en, int boy, String icerik) {

		for (int i=0; i<boy; i++){
			for (int j=0; j<en; j++) {
				icerikCiz(icerik);
			}
			altSatir();
		}
		
		for (int i=(en-1); i>0; i--){
			for (int j=0; j<i; j++) {
				icerikCiz(icerik);
			}
			altSatir();
		}		
	}
	
	public static void icerikCiz(String x) {
		System.out.print(x);		
	}

	public static void altSatir() {
		System.out.println();	
	}
}
