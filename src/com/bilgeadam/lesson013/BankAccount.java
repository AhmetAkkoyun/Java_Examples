package com.bilgeadam.lesson013;

import java.util.Random;

public class BankAccount {
	
	/*
	 * bir Interest rate account number bir de balance ozelliklerim var
	 * şimdi bu sınmıfı bir soyutlamanızı istiyorum bizim banklamızın faiz oranı 0,05 olsun
	 * daha sonra faiz getirisini hesaplayan metot yazalım  getInterestRate()

	 * bir de getInformation() metodu yazıp hesap bilgilerimizi gösterelim.
	 */

	static double faizOrani = 0.05; 
    int bakiye;
    String sahip;

    public BankAccount(String adi) {
        this.sahip = adi;
       	Random random = new Random();
        this.bakiye = random.nextInt(1,1000000);
    }
    
    public static BankAccount yeni(String a) {
        return new BankAccount(a); 	
    }

    public void getInformation() {
        System.out.println("Hesap Sahibi: "+sahip);
        System.out.println("Hesap Bakiyesi: "+bakiye);
        System.out.println("Faiz Getirisi: "+getInteresetRate(bakiye));     
    }
			
	public double getInteresetRate(int bakiye) {
		return bakiye*BankAccount.faizOrani; 
	}

}
