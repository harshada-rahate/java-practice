package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.RBI;
import com.braindata.bankmanagement.serviceimpl.SBI;

import java.util.Scanner;



public class Testbank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		RBI bank = new SBI();
		while(true)
		{
		System.out.println("Select \n1)CreateAccount \n2)Display All Details \n3)Deposit \n4)Withdraw \n5)Check Balance ");
		System.out.println("Enter Choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1 :bank.createAccount();
		         break;
		case 2 : bank.displayAllDetails();
                 break;
		case 3 : bank.depositeMoney();
                 break;
		case 4 : bank.withdrawal();
                 break;
		case 5 : bank.balancecheck();
                 break;
	   default :System.exit(0);
		}
	}
}
}
