package com.bilgeadam.lesson013;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount hesap1 = BankAccount.yeni("Ahmet");
		hesap1.getInformation();
		
		BankAccount hesap2 = BankAccount.yeni("Ahmet");
		hesap2.getInformation();

	}

}
