package com.bilgeadam.lesson013;

/*
 * öğrencinin bir numarası bir ismi olsun
 * daha sonra kayıt metodu yazalım
 * Mustafa adlı öğrendci başarı ile kayıt edildi öğrenci numarası 1
 * Serkan adlı öğrenci başarı ile kayıt edildi öğrenci numarası 2
 */

public class Student {

    static int sayac = 0;
    int ogrenciNo;
    String ogrenciAdi;

    public Student (String adi) {
        ogrenciAdi = adi;
    	ogrenciNo = ++sayac;
    }
    
    public static Student yeni(String a) {
        return new Student(a); 	
    }

    public void yazdir() {
        System.out.println(ogrenciAdi + " adlı öğrenci başarıyla kaydedildi. Öğrenci numarası: " + ogrenciNo);
    }

}
