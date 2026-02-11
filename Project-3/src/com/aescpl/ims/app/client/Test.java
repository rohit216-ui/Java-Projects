package com.aescpl.ims.app.client;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import com.aescpl.ims.app.serviceimpl.Karvenagar;
import com.aescpl.ims.servicei.CJC;


public class Test {

	public static void main(String[] args) {
		
		CJC cj = new Karvenagar();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		do {
			System.out.println("############ Welcome To Institute Management System	##############");
			System.out.println("		Welcome CJC\nPlease Choose Valid Option from Menu");
			System.out.println("Enter 1 to Add Details\nEnter 2 to view details\nEnter 0 to exit");
			int ch = sc.nextInt();
			if (ch==1) {
				System.out.println("Enter 1 to Add Course Details\nEnter 2 to Add Faculty Details\nEnter 3 to Add Batch Details\nEnter 4 to Add Student Details\nEnter 0 to Return to the main menu");
				int pf = sc.nextInt();
				switch(pf) {
			
					case 1: cj.addCourse();
					break;
			
					case 2: cj.addFaculty();
					break;
			
					case 3: cj.addBatch();
					break;
			
				case 4: cj.addStudent();
					break;
				
					case 0: break;
			
							
				} 
			} else if (ch==2) {
				System.out.println("Enter 1 to View Course Details\nEnter 2 to view Faculty Details\nEnter 3 to view Batch details\nEnter 4 to View student Details\nEnter 0 to return to the main menu");
				int pf = sc.nextInt();
				switch(pf) {
					case 1: cj.viewCourse();
					break;
				
					case 2: cj.viewFaculty();
					break;
				
					case 3: cj.viewBatch();
					break;
				
					case 4: cj.viewStudent();
					break;
					
					case 5: 
					break;
				
					
				}
			} else if (ch==0) {
				flag = false;
			}
		}while(flag);

	}

}

