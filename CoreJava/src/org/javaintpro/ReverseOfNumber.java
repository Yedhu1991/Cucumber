package org.javaintpro;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("NUmber :");
		int in = s.nextInt();
		int i=0,j=0,a;
		a=in;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;}
		System.out.println(j);
					
		}
		 
	}


