package com.bilgeadam.lesson006;

public class Question33 {

	public static void main(String[] args) {
		int sayi1 = 10;
		Integer sayi2;
		
		
		sayi2 = sayi1;
		sayi2=Integer.valueOf(sayi1); // böyle de olur. int sayı Integer sayı oldu.
		
		double sayi3 = 15.4;
		Double sayi4 = Double.valueOf(sayi3);  // value of primitive türleri wrapper türlere çevirir
		
		Integer[] array = new Integer[4]; // Integer türünde 4 boyutlu bir array dizisi oluşturdu.
		array[0]=10;
		
		
		for(int i=1;i<4;i++) {
			array[i]=i;
		}
		
		String a= Integer.valueOf(sayi1).toString();  // normalde sayi1 primitive olduğu için bir metot seçilmiyordu. 
		                                              // valueof ile sayi1 wrapper Integer oldu.  
		                                              // böylece toString metodunu kullanabildik.
		String b= Integer.toString(sayi1); // bu da olur.
		
		// string değer nasıl sayısal değer olur???	
		String deger = "123";
		int sayi5 = Integer.parseInt(deger);    // wrapper deger değişkeni primitive int değişkeni oldu.
		System.out.println(sayi5);
		double sayi6 = Double.parseDouble(deger);
		long sayi7 = Long.parseLong(deger);
		char sayi8 = (char) Integer.parseInt(deger);  // çünkü char demek aslında integer değerli bir karakter demek
		
		char karakter = 'a';
		String deger2 = Character.toString(karakter);
		
		
		
		
			
		

	}

}
