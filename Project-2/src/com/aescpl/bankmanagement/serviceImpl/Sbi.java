package com.aescpl.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.aescpl.bankmanagement.model.Account;
import com.aescpl.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	double min_limit = 100;
	double max_limit = 1000000;
	

	Account ac = new Account();
	Scanner sc = new Scanner(System.in);
	

	@Override
	public void createAccount() {
		
		while (true) {
			System.out.println("BMS Account Creation Services");
			System.out.println("As per Bank Rule, Customer Should Deposit Minimum of Rs 500 at the time of account creation");
			System.out.println("Enter Amount: ");
			double amt1 = sc.nextDouble();
			if (amt1 < 500) {
				System.out.println("As per Bank Rule, Customer Should Deposit Minimum of Rs 500 at the time of account creation\nContact Your Branch For More Details.");
				
			}
			else {
				ac.setBalance(amt1);
				break;
			}
		
		}
		
	//Account creation Form
		
	// Account Number
		while (true) {
			System.out.println("Enter Account Number");
			int acno = sc.nextInt();
			if (String.valueOf(acno).length() > 8) {
				System.out.println("Account Number Should be 8 digit Number");
			} else if (String.valueOf(acno).length() < 8) {
				System.out.println("Account Number Should be 8 digit Number");
			} else {
				ac.setAccNo(acno);
				break;
			}

		}

	// Age
		while (true) {
			System.out.println("Enter Age");
			short agno = sc.nextShort();
			if (agno < 18 || agno > 100) {
				System.out.println("Age should be minimum 18 and Maximum 100 yrs");
			} else {
				ac.setAge(agno);
				break;
			}
		}


	// Mobile No.
		while (true) {
			System.out.println("Enter Mobile Number");
			String mbno = sc.next();
			if (mbno.length() != 10) {
				System.out.println("Mobile Number Should be 10 digit Number");
			} else {
				ac.setMobNo(mbno);
				break;
			}
		}

		sc.nextLine();
	
		//Name
		boolean flag3;
		do {
			System.out.println("Enter Your Name: ");
		    String nm = sc.nextLine();
		    flag3 = false;
		    if (nm.trim().isEmpty()) {
		        System.out.println("Name cannot be empty. Please enter a valid name.");
		        flag3 = true;
		        continue;
		    }
		    for (int i = 0; i < nm.length(); i++) {
		        char ch = nm.charAt(i);
		        int ascii = (int) ch;

		        if (!((ascii >= 65 && ascii <= 90) ||
		              (ascii >= 97 && ascii <= 122) ||
		              (ascii == 32))) {

		            System.out.println("Enter Valid Name (No Digits, No Special Characters allowed, Space is allowed)");
		            flag3 = true;  
		            break;          
		        }
		    }
		    if (flag3==false) {
		        ac.setName(nm);
		    }
		} while (flag3==true);
 
		
	//Aadhar Number
		while (true) {
			System.out.println("Enter Your Aadhar Number");
			String adno = sc.next();
			if (adno.length()!=12) {
				System.out.println("Aadhar Number Should be 12 Digit");
			}
			else {
				ac.setAdharNo(adno);
				break;
			}
		}

	
	//Gender
		boolean flag1 = true;
		do {
			
			System.out.println("Enter Your Gender\n1. Male\n2. Female\n3. Others");
			String gd = sc.next();
			if (gd.equalsIgnoreCase("Male")==false && gd.equalsIgnoreCase("Female")==false && gd.equalsIgnoreCase("Others")==false) {
				System.out.println("Please Enter Valid Options");
			} else {
				ac.setGender(gd);
				flag1 = false;
			}
				
		} while(flag1==true);
		
	//UPIN
		boolean flag2 = true;
		do {
			System.out.println("UPIN Creation Service\nGuidelines:\n1.UPIN (Unique Pin) is Unique Identification Passcode which is required for transactions.\n2.Please Don't Share Your UPIN with anyone\n3.UPIN must have 4 digits only. No characters, symbols allowed");
			System.out.println("Enter Your UPIN :");
			int pin = sc.nextInt();
			if (String.valueOf(pin).length()<4 || String.valueOf(pin).length()>4) {
				System.out.println("Please Enter 4 digits only.");	
			} else {
				ac.setUpin(pin);
				System.out.println("UPIN is set.\nPlease Remember Your UPIN for future transactions.\nAccount Created Succesfully.");
				flag2 = false;
				}
			} while(flag2==true); 
			
	}	
	

	@Override
	public void displayAllDetails() {
		System.out.println("Enter Your UPIN:");
		int pin = sc.nextInt();
		if (String.valueOf(pin).length()<4 || String.valueOf(pin).length()>4) {
			System.out.println("Please Enter 4 digits only.");
		} else if (pin!=ac.getUpin()) {
			System.out.println("Inavlid Pin");
		} else if (pin==ac.getUpin()) {
		System.out.println("Your Account Number: " + ac.getAccNo());
		System.out.println("Your Name: " + ac.getName());
		System.out.println("Your Mobile Number: +91 " + ac.getMobNo());
		System.out.println("Your Aadhar No: " + ac.getAdharNo());
		System.out.println("Your Age: " + ac.getAge());
		System.out.println("Your Gender: " + ac.getGender());
		System.out.println("Your Account Balance: " + ac.getBalance());
		}
	}

	@Override
	public void depositeMoney() {
		while (true) {
			System.out.println("Enter Your UPIN:");
			int pin = sc.nextInt();
			if (String.valueOf(pin).length()<4 || String.valueOf(pin).length()>4) {
				System.out.println("Please Enter 4 digits only.");
			} else if (pin!=ac.getUpin()) {
				System.out.println("Invalid Pin");
			}	else {
				System.out.println("Enter Amount:");
				double amt = sc.nextDouble();
				if (amt < min_limit || amt > 1000000) {
					System.out.println("Minimum Deposit Amount 100 and Maximum 10,00,000");
					System.out.println("Contact Branch For More Details\nThank You! Visit again.");
					break;
				} else {
					double total_balance = ac.getBalance() + amt;
					ac.setBalance(total_balance);
					System.out.println("Transaction Executed Succesfully\nThank You!");
					break;
				}
			}
			
		
		}

	}

	@Override
	public void withdrawal() {
		while (true) {
			System.out.println("Enter Your UPIN:");
			int pin = sc.nextInt();
			if (String.valueOf(pin).length()<4 || String.valueOf(pin).length()>4) {
				System.out.println("Please Enter 4 digits only.");
			} else if (pin!=ac.getUpin()) {
				System.out.println("Inavlid Pin");
			} else {
				System.out.println("Enter Amount:");
				double amt = sc.nextDouble();
				if (amt > ac.getBalance()) {
				System.out.println("Low Balance");
				System.out.println("Thank You For Using BMS!");
				break;
				} else if (amt > max_limit) {
				System.out.println("Withdrawl Limit Exceed, Contact Branch For more details.");
				System.out.println("Thank You For Using BMS!");
				break;
				} else if (amt < min_limit) {
				System.out.println("Minimum Limit is 100");
				System.out.println("Thank You For Using BMS!");
				break;
				} else {
				double total_balance = ac.getBalance() - amt;
				ac.setBalance(total_balance);
				System.out.println("Transaction Executed Succesfully!");
				System.out.println("Thank You For Using BMS!");
				break;
				}}
			
		
	}
	}		

	@Override
	public void balanceCheck() {
		System.out.println("Enter Your UPIN:");
		int pin = sc.nextInt();
		if (String.valueOf(pin).length()<4 || String.valueOf(pin).length()>4) {
			System.out.println("Please Enter 4 digits only.");
		} else if (pin!=ac.getUpin()) {
			System.out.println("Inavlid Pin");
		} else if (pin==ac.getUpin()) {
		System.out.println("Your Account Balance is :" + ac.getBalance());
		}
	}

}
