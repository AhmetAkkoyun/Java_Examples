package com.bilgeadam.lesson012;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen bir seçim yapın:\n1 ---> Taş\n2 ---> Kağıt\n3 ---> Makas");
        int secilen = scanner.nextInt();
        
        while (secilen < 1 || secilen > 3) {
            System.out.println("Geçersiz seçim! Lütfen 1, 2 veya 3 girin: \n1 ---> Taş\n2 ---> Kağıt\n3 ---> Makas");
            secilen = scanner.nextInt();
        }
        
        String pcSecim = pcSec().toString();
        String oyuncuSecim = "";
        
        if (secilen == 1) {
            oyuncuSecim = "TAS";
        } else if (secilen == 2) {
            oyuncuSecim = "KAGIT";
        } else {
            oyuncuSecim = "MAKAS";
        }
        
        System.out.println("Bilgisayarın seçimi: " + pcSecim);
        System.out.println("Kullanıcının seçimi: " + oyuncuSecim);
        System.out.println("Sonuç: " + tasKagitMakas(pcSecim, oyuncuSecim));
    }
    

    
    public static TKM pcSec() {
        TKM[] liste = TKM.values();
        Random random = new Random();
        int index = random.nextInt(liste.length);
        return liste[index];
    }

    public static String tasKagitMakas(String pc, String oyuncu) {
        if (pc.equals(oyuncu)) {
            return "Beraberlik";
        } else if ((pc + oyuncu).equals("makaskagit") || (pc + oyuncu).equals("tasmakas") || (pc + oyuncu).equals("kagittas")) {
            return "Kaybettin...";
        } else {
            return "Kazandın!!!";
        }
    }
}
