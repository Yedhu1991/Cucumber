package org.javaintpro;

import java.util.Scanner;

public class AmstrongCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int in = s.nextInt();
		int a=in,i=0,j=0;
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(in==j) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("not an amstrong");
		}
		
	}

}
