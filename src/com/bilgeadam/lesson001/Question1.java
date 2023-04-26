package com.bilgeadam.lesson001;

public class Question1 {
	
public static void main(String[] args) {
	

	// primitive(ilkel) veri tipleri
	/*
	 * değişken isimlerini adlandırmada camel caswe kullanılır
	 * ilk harf küçük daha sonra gelen yeni kelime 
	 * varsa onun ilk harfi büyük olarak decam eder
	 * 
	 */
	
	int sayi=5;
	byte myByte=25;
	short myShort=5222;
	long myLong=1_0000_0000_0;
	double myDouble=125000000000000000000000000000.55;
	char myChar='A'; // ctrl alt aşağı tuşu satırı aşağı kopyalar
	char myChar2=66;
	boolean myBoolean=true; // true yada false  
	float myFloat=128.65f;
	
	System.out.println("int deger==> "+sayi);  // println yazdırdıktan sonra alt satıra geçer
	System.out.print("int deger==> "+sayi);    // print yazdırdıktan sonra aynı satırda kalır
	System.out.println("int deger==> "+sayi);  // bu satir üst satirin yaninda yazacak
	
	// run kısayolu : ctrl f11
	
	System.out.println("int deger==> "+sayi);
	System.out.println("byte deger==> "+myByte);
	System.out.println("short deger==> "+myShort);
	System.out.println("long deger==> "+myLong);
	System.out.println("double deger==> "+myDouble);
	System.out.println("char deger==> "+myChar);
	System.out.println("char deger2==> "+myChar2);
	System.out.println("boolean deger==> "+myBoolean);
	System.out.println("float deger==> "+myFloat);
	
	int sayi2 = 69; 
	System.out.println("int degerin char karsiligi==> "+ (char)sayi2);  // sayi2 = 69 = E harfinin ascii degeri
	System.out.println("iki char degerinin toplanmasi==> "+ (myChar+myChar2));  // =131
	
	// Wrapper Class (Sarmalayıcı Sınıflar)
	
	Integer myInteger = 529;
	Integer myInteger2 = null;
	int myInt = 0;
		
	System.out.println("INTEGER ==>"+myInteger);
	System.out.println("INTEGER2 ==>"+myInteger2);
	System.out.println("int ==>"+myInt); 
	
	myInteger2 = myInt;
	System.out.println("INTEGER2 ==>"+myInteger2);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.toString(myInt)); // Integer değeri stringe çevirir
	
	System.out.println("Double Max ==>" + Double.MAX_VALUE+ " min ==>" + Double.MIN_VALUE);
	System.out.println("Long Max ==>" + Long.MAX_VALUE+ " min ==>" + Long.MIN_VALUE);
	System.out.println("Short Max ==>" + Short.MAX_VALUE+ " min ==>" + Short.MIN_VALUE);
	System.out.println("Byte Max ==>" + Byte.MAX_VALUE+ " min ==>" + Byte.MIN_VALUE);
	System.out.println("Float Max ==>" + Float.MAX_VALUE+ " min ==>" + Float.MIN_VALUE);
	System.out.println("Integer Max ==>" + Integer.MAX_VALUE+ " min ==>" + Integer.MIN_VALUE);
	System.out.println("////////////////////////////////////////////////");
	
	long number1 = 256;
	long number2 = 100;
	byte number3 = (byte) number2;
	byte number4 = (byte) number1;   // 0-255 byte arasında gideceği için 256 byte değeri 0 olarak yazdırılır 
	System.out.println(number3);
	System.out.println(number4);
	
	long result=number1+number3;
	System.out.println(result);  // number1 ve number3 byte. sonuc long isteniyor. 
	                             // long, byteı kapsar. bu yüzden program hata vermeyecek
	
	short number5=(short)(number1+number3);  // burada ise başa short gelmelidir yoksa hata verir
	short number6=(short)(number2+number3);  // çünkü short longu kapsamaz
	
	short number7 = (short) number2;     // number2 long olduğu için short longu kapsamaz bu yüzden shorta çevirdik  
	long number8 = number7;              // number7 short olarak verilmişti. long shortu kapsar sorun yok.
	
	System.out.println(number5);
	System.out.println(number6);
	System.out.println(number7);
	System.out.println(number8);
	
	double number9 = 25.8;
	long result2 = (long) number9+number2;  // çünkü long double değerini kapsamaz
	
	double result3 = number9+number2;  // burada sorun yok. double longu kapsar.
	
    System.out.println(result2);
	System.out.println(result3);
	
	int number10 = 125/10;
	System.out.println(number10);  // int virgülden sonrasını her zaman aşağı yuvarlar. görmez. 
	
	float number11= (float) number9+10;  // number9 double olduğu için floata çevirdik.
	double number12 = number11+10;    // burada sorun yok.
	
	System.out.println(number11);
	System.out.println(number12);
	
	String isim="mustafa";
	System.out.println(isim+number10);
	String a=isim+number10;
	System.out.println(a);
	String deger1=Integer.toString(number10);
	System.out.println(deger1.length());
	String deger2= number10+"";
	String deger3= ""+number10;
	System.out.println(deger2);
	System.out.println(deger3);
	
	

	
	
	
	
	
	
	
	
}	

}
 