package com.bilgeadam.lesson013;

public class StudentTest {

    public static void main(String[] args) {
        Student ogrenci1 = new Student("Mustafa");
        ogrenci1.yazdir();

        Student ogrenci2 = new Student("Serkan");
        ogrenci2.yazdir();
        
        
        Student ogrenci3 = Student.yeni("Mustafa");              // nesne oluşturmayı da diğer dosyadan alıyorum
        
    }

}
