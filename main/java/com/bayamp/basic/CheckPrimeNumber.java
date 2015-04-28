package com.bayamp.basic;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args){
		System.out.print("Enter the number you want to check: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("Is number "+num+" a prime number? " + isPrime(num));
		
	}
	
	private static boolean isPrime(int inputNum){
		for(int i =2; i<=inputNum/2; i++){
			if(inputNum%i==0){
				return false;
			}
		}
		return true;
	}
}
