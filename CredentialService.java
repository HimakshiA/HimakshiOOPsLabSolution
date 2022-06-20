package com.himakshi.service;

import java.util.Random;

import com.himakshi.model.Employee;

public class CredentialService {

     public char[] generatePassword() {
    	 
    	 String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	 String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    	 String numbers = "0123456789";
    	 String specialCharacters = "!@#$%^&*_=+-/.?<>)";
    	 
    	 String values = capitalLetters + smallLetters + numbers + specialCharacters; 
    	 
    	 
    	 Random random = new Random();
    	 
    	 char[] password = new char[8];
    	 
    	 for (int i = 0; i < 8; i++) {
    		 
    		 
    		 password[i] = values.charAt(random.nextInt(values.length()));
    		 
    	 }
    	 return password;
    	 
     }
     public String generateEmailAddress(Employee emp,String dept) {
 		
 		//return firstName+lastName+"@"+department+"."+company+".com";
 		return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+dept+".abc.com";
 	}
 	
 	public void showCredentials(Employee emp, String email) {
 		//display email id and password
 		
 		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
 		
 		System.out.println("Email  --> "+email);
 		
 		System.out.print("Password --> " );
 		System.out.println(generatePassword());  
 		
 	}

 }
