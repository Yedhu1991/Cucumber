package org.javaintpro;

import java.util.Scanner;

public class NumberPalindrom {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int in = s.nextInt();
		int a,i=0,j=0;
		a=in;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(in==j) {
			System.out.println(" palindrom");
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
