package com.aescpl.bankmanagement.client;
import java.util.Scanner;

import com.aescpl.bankmanagement.service.Rbi;
import com.aescpl.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
	Rbi rb = new Sbi();
	Scanner sc = new Scanner(System.in);
	while(true) 
	{
		System.out.println("----------------------------------------BMS----------------------------------------------------------");
		System.out.println("Welcome To BMS : Bank Management System by SBI");
		System.out.println("Press 1 For Account Creation"+"\nPress 2 to Display your Info"+"\nPress 3 For Money Deposit"+"\nPress 4 For Money Withdrawl"+"\nPress 5 To Check Your Balance"+"\nPress 0 to Exit");
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
			case 1:rb.createAccount();
			break;
			
			case 2:rb.displayAllDetails();
			break;
			
			case 3:rb.depositeMoney();
			break;
			
			case 4:rb.withdrawal();
			break;
			
			case 5:rb.balanceCheck();
			break;
			
			case 0:System.out.println("Thank You! Visit again");
			System.exit(0);
			
		}
	}
		
	}
	
	}
	
	

