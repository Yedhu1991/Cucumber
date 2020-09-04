package org.selenium;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("entert the age");
		int age = s.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else
		{
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println("not eligible");
			}
		
	}}}

