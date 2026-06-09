package com.braindata.bankmanagement.serviceimpl;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.RBI;
import java.util.Scanner;


public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account acc = new Account();

	public void createAccount()

	{

		System.out.println("     Enter your Account number     ");
		acc.setAccNO(sc.nextInt());

		System.out.println("     Enter your name      ");
		acc.setName(sc.next() + sc.nextLine());

		System.out.println("     Enter your Mobile Number     ");
		acc.setMobNo(sc.nextLong());

		System.out.println("Enter your Adhar Number...\n");
		acc.setAdharNo(sc.nextLong());

		System.out.println("Enter your Gender...\n ");
		acc.setGender(sc.next()+sc.nextLine());

		System.out.println("Enter your Age...\n");
		acc.setAge(sc.nextInt());

		System.out.println("Enter your Balance...\n ");
		acc.setBalance(sc.nextDouble());

		System.out.println("Account create Successfully...\n");
	}

	public void displayAllDetails() {
		System.out.println("......Account Details.....");
		System.out.println("Account number :" + acc.getAccNo());
		System.out.println("Name :" + acc.getName());
		System.out.println("Mobile Number : " + acc.getMobNo());
		System.out.println("Adhar Number : " + acc.getAdharNo());
		System.out.println("Gender : " + acc.getGender());
		System.out.println("Age :" + acc.getAge());
		System.out.println("Balance :" + acc.getBalance());
	}

	public void depositeMoney() {
		System.out.println("Enter Deposite Amount.\n");

		double amount = sc.nextDouble();

		if (amount > 0) {

			acc.setBalance(acc.getBalance() + amount);

			System.out.println("Money Deposite Successfully.");
		} else {
			System.out.println("Not Deposited amount");

		}
	}

	public void balanceCheck() {
		System.out.println("check available balance :\n" + acc.getBalance());
	}




	public void withdrawal() {

		System.out.println(".....Enter a withdrawal amount.....");

		double amount = sc.nextDouble();

		if (amount > 0 && amount <= acc.getBalance()) {

			acc.setBalance(acc.getBalance() - amount);

			System.out.println("Money withdrawal successfully.\n");
		} else

		{
			System.out.println("unsufficient balance\n");

		}
	}



	public void balancecheck() {
		// TODO Auto-generated method stub
		
	}

}