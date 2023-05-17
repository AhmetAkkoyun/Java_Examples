package com.bilgeadam.lesson008;

/*
 * menu isimli 1 metot yazalım
 * 1 harf saydırma
 * 2 harf değiştirme
 * 3 palindrom
 * 4 çıkış  
 */

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {				
		menu();		
	}

	public static void menu() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Aşağıdaki seçimlerinden birini yapın: \n Harf saydırma için (1) \n Harf değiştirme için (2) \n Palindrom kontrolü için (3) \n Çıkış yapmak için (4)");
		int secim = scanner.nextInt();		
		
		switch(secim) {
		case 1:
			System.out.println("harf saydırma seçildi\n");
			harfsaydir();			
			System.out.println("\nYeniden yönlendiriliyor...\n");
			menu();
			break;		
	    case 2:
		    System.out.println("harf değiştirme seçildi\n");
		    harfdegistir();
		    System.out.println("\nYeniden yönlendiriliyor...\n");
		    menu();
		    break;    
        case 3:
	        System.out.println("palindrom seçildi\n");
	        palindrom();
	        System.out.println("\nYeniden yönlendiriliyor...\n");
	        menu();
	        break;
        case 4:
	        System.out.println("çıkış seçildi\n");
	        System.out.println("\nYeniden yönlendiriliyor...\n");
	        break; 
        default:
        	menu();
        	
        	
		}         	       			
	}

	public static void harfsaydir() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir şeyler yazın: ");
		String yazi = scanner.nextLine();
		System.out.print("Sayılmasını istediğiniz harfi yazın: ");
		String harf = scanner.nextLine();
		int sayac = 0;
		for (int i=0; i<(yazi.length()); i++) {
			if (harf.charAt(0)==yazi.charAt(i)) {      // harf.charAt(0)  harf seçimindeki ilk karakter. yani seçimin kendisi. bu stringi chara kolayca çevirebilmek için.
				sayac++;
			}
		}
		System.out.println("harf sayımı yapıldı. sonuç: "+sayac);		
	}

	
	public static void harfdegistir() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir şeyler yazın: ");
		String yazi = scanner.nextLine();
		System.out.print("Hangi harf değişsin?: ");
		String harf1 = scanner.nextLine();
		System.out.print(harf1+"harfleri hangi harf ile değiştirilsin?: ");
		String harf2 = scanner.nextLine();
		
		System.out.println("YÖNTEM 1");
	    System.out.println("harf değişimi yapıldı.: "+(yazi.replace(harf1.charAt(0), harf2.charAt(0))));
		
	    System.out.println("YÖNTEM 2");
		String yeniyazi = "";
		for (int i=0; i<(yazi.length()); i++) {
			if (harf1.charAt(0)==yazi.charAt(i)) {      
				yeniyazi+=harf2.charAt(0);
			} else {
				yeniyazi+=yazi.charAt(i);
			}
		}
		System.out.println("harf değişimi yapıldı.: "+yeniyazi);
			
	}

	public static void palindrom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir kelime yazın: ");
		String yazi = scanner.nextLine();
		
		String birinci = yazi.substring(0, yazi.length()/2);
		String ikinci = yazi.substring(yazi.length()/2);		
		
		if (birinci.length()!=ikinci.length()) {
			ikinci = ikinci.substring(1);
		}
		String ikinciters = "";
		
		for (int i=(ikinci.length()-1); i>=0; i--) {
			ikinciters+=ikinci.charAt(i);		
		}
		
		if (birinci.equals(ikinciters)){
			System.out.println("Palindrom!");
		} else {
			System.out.println("Palindrom değil!");
		}
		
		/*
        String ifade = "abcdcba";
		String sonuc = "palindrom";
		for (int i=0; i<ifade.length()/2; i++) {
			if (ifade.charAt(i)==(ifade.charAt(ifade.length()-(i+1)))) {
			} 
			else {
				sonuc = "palindrom değil";
			}
		}
		System.out.println(sonuc);
		*/	
	}	
}
