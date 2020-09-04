package org.javaintpro;

import java.util.Scanner;

public class factorialNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to find Factorial :");
		int in = s.nextInt();
		int temp=1;
		if(in==0) {
			System.out.println(1);
		}
		else {
		for(int i=1;i<=in;i++) {
			temp=i*temp;
		}
		System.out.println(temp);}
	}

}
