package com.bayamp.basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num=sc.nextInt();
		int result =factorialResult(num);
		System.out.println("The result is " + result);
	}
	
	private static int factorialResult(int n){
		int result=1;
		for(int i =1; i<=n; i++){
			result = result*i;
		}
		return result;
	}
}
