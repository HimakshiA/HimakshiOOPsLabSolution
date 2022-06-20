package com.himakshi.main;

import java.util.Scanner;

import com.himakshi.service.CredentialService;

import com.himakshi.model.Employee;

	public class Driver {

		public static void main(String[] args) {
			
			int ch;
			String dept="";
			String email="";
			Employee emp=new Employee("Himakshi","Antad");
			Scanner sc=new Scanner(System.in);
		    System.out.println("Please Enter the Department for the following");
		    System.out.println("1.technical\n2.admin\n3.hr\n4.legal");
		    System.out.println("Enter Your Choice:");
		    ch=sc.nextInt();
		    switch(ch)
		    {
		    case 1:dept="technical";break;
		    case 2:dept="admin";break;
		    case 3:dept="hr";break;
		    case 4:dept="legal";break;
		    }
		    CredentialService cr=new CredentialService();
		    email=cr.generateEmailAddress(emp,dept);
		    cr.showCredentials(emp,email);
			
		}
	}


