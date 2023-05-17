package com.bilgeadam.lesson005;

/*
 * kullanıcıdan doğum gününü ve ayını alıp
 * hangi burç olduğunu yazdıran programı yazın
 */

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);	
		System.out.print("lütfen doğduğunu ayı giriniz: ");
		String ay = input.nextLine();	
		System.out.print("lütfen ayın kaçıncı günü olduğunu yazınız: ");
		int gun = input.nextInt();
		int max;
		
		switch(ay) {
		case "1", "01", "OCAK", "Ocak", "ocak":
			max = 31; 
			if (gun<22) {
				System.out.println("Burcunuz : OĞLAK");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : KOVA");
				}
			}
			break;
		case "2", "02", "ŞUBAT", "Şubat", "şubat":
			max = 29;
			if (gun<20) {
				System.out.println("Burcunuz : KOVA");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : BALIK");
				}
			}
			break;
		case "3", "03", "MART", "Mart", "mart":
			max = 31;
			if (gun<21) {
				System.out.println("Burcunuz : BALIK");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : KOÇ");			
				}				
			}
			break;
		case "4", "04", "NİSAN", "Nisan", "nisan":
			max = 30;
			if (gun<21) {
				System.out.println("Burcunuz : KOÇ");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : BOĞA");
				}
			}
			break;
		case "5", "05", "MAYIS", "Mayıs", "mayıs":
			max = 31;
			if (gun<22) {
				System.out.println("Burcunuz : BOĞA");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : İKİZLER");					
			    }
			}
			break;
		case "6", "06", "HAZİRAN", "Haziran", "haziran":
			max = 30;
			if (gun<23) {
				System.out.println("Burcunuz : İKİZLER");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : YENGEÇ");
			    }
			}
			break;
		case "7", "07", "TEMMUZ", "Temmuz", "temmuz":
			max = 31;
			if (gun<23) {
				System.out.println("Burcunuz : YENGEÇ");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : ASLAN");
			    }
			}
			break;
		case "8", "08", "AĞUSTOS", "Ağustos", "ağustos":
			max = 31;
			if (gun<23) {
				System.out.println("Burcunuz : ASLAN");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
				    System.out.println("Burcunuz : BAŞAK");	
			    }
			}
			break;
		case "9", "09", "EYLÜL", "Eylül", "eylül":
			max = 30;
			if (gun<23) {
				System.out.println("Burcunuz : BAŞAK");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : TERAZİ");					
			    }
			}
			break;
		case "10", "EKİM", "Ekim", "ekim":
			max = 31;
			if (gun<23) {
				System.out.println("Burcunuz : TERAZİ");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : AKREP");					
			    }
			}
			break;
		case "11", "KASIM", "Kasım", "kasım":
			max = 30;
			if (gun<22) {
				System.out.println("Burcunuz : AKREP");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : YAY");
			    }
			}
			break;
		case "12", "ARALIK", "Aralık", "aralık":
			max = 31;
			if (gun<22) {
				System.out.println("Burcunuz : YAY");
			} else {
				if (gun>max) {
					System.out.println(ay+" ayı en fazla "+max+" gün olabilir!");
					System.out.println("daha sonra tekrar deneyiniz");
					break;
				} else {
					System.out.println("Burcunuz : OĞLAK");
			    }
			}
			break;
		default:
			System.out.println("yanlış bir seçim yaptınız.");
			System.out.println("yeniden deneyiniz");
			break;			
		}
	}
}
