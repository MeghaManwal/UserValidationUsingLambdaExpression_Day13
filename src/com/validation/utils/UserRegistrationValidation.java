package com.validation.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserRegistrationValidation {
	
	public static void isValidFirstName() {
		System.out.println("Valid First Names: \n");
		Pattern pattern=Pattern.compile("^[A-Z]{1}[A-Z a-z]{2,}$");
		
		List<String> firstName=new ArrayList<>();
		firstName.add("Rishika");
		firstName.add("nehA");
		firstName.add("12Rohan");
		firstName.add("Sakshi");
		firstName.add("@Pooja");
		
		List<String> correctFirstName = firstName.stream()
				                        .filter(pattern.asPredicate())
				                        .collect(Collectors.toList());
		correctFirstName.forEach((e) -> {
		      System.out.print(e + "\n");
	    });
		System.out.println("\n----------------------------------------------------\n");
	}
	
	public static void isValidLastName() {
		System.out.println("Valid Last Names: \n");
		Pattern pattern=Pattern.compile("^[A-Z]{1}[A-Z a-z]{2,}$");
		
		List<String> lastName=new ArrayList<>();
		lastName.add("Jonas");
		lastName.add("Benn21ET");
		lastName.add("KaPO@r");
		lastName.add("#!chopra");
		lastName.add("SHEIKH");
		
		List<String> correctLastName = lastName.stream()
				                       .filter(pattern.asPredicate())
				                       .collect(Collectors.toList());
		correctLastName.forEach((e) -> {
		      System.out.print(e + "\n");
	    });
		System.out.println("\n----------------------------------------------------\n");
	}
	
	public static void isValidEmailId() {
		System.out.println("Valid Email Id's: \n");
		Pattern pattern=Pattern.compile("^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$");
		
		List<String> emailId=new ArrayList<>();
		emailId.add("abc.xyz44@#orkut.com");
		emailId.add("!xyAD@.google.co.in");
		emailId.add("4456@!33#@outlook.com");
		emailId.add("24Singh.Ray@outlook.com");
		emailId.add("abc56.xyz@gmail.com");
		
		List<String> correctEmailId = emailId.stream()
				                       .filter(pattern.asPredicate())
				                       .collect(Collectors.toList());
		correctEmailId.forEach(System.out::println);
		System.out.println("\n----------------------------------------------------\n");
	}
	
	public static void isValidPhoneNumber() {
		System.out.println("Valid Phone Numbers: \n");
		Pattern pattern=Pattern.compile("^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$");
		
		List<String> phoneNumber=new ArrayList<>();
		phoneNumber.add("9876543210");
		phoneNumber.add("+086 8765443289");
		phoneNumber.add("+91 9854632012");
		phoneNumber.add("76 87666435210");
		phoneNumber.add("+919874320668");
		
		List<String> correctPhoneNumber = phoneNumber.stream()
				                       .filter(pattern.asPredicate())
				                       .collect(Collectors.toList());
		correctPhoneNumber.forEach(System.out::println);
		System.out.println("\n----------------------------------------------------\n");
	}
	
	public static void isValidPassword() {
		System.out.println("Valid Password: \n");
		Pattern pattern=Pattern.compile("^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$");
		
		List<String> password=new ArrayList<>();
		password.add("$%goIn@@");
		password.add("44Fast#track");
		password.add("!GeTAWAY55@");
		password.add("OMEN##22");
		password.add("(98@#%665");
		
		List<String> correctPassword = password.stream()
				                       .filter(pattern.asPredicate())
				                       .collect(Collectors.toList());
		correctPassword.forEach(System.out::println);
		System.out.println("\n----------------------------------------------------\n");
	}
    
	public static void main(String[] args) {
		isValidFirstName();
		isValidLastName();
		isValidEmailId();
		isValidPhoneNumber();
		isValidPassword();
		
	}
}
