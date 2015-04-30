package com.bayamp.array;
//note if just print array, need to 
//import java.util.Arrays
//and use Arrays.toString(array_name)
//otherwise, it prints hashcode

public class Fibonacci {
	public static void main(String[] args){
		int num=5;
		int[] fib = new int[num];
		if(num<=0){
			System.out.println("Please enter a valid number.");
		}
		if(num==1){
			fib[0]=0;
		}
		else{
			fib[0]=0;
			fib[1]=1;
			for(int i=2; i<num; i++){
				fib[i]=fib[i-2]+fib[i-1];
			}
		}
		System.out.print("Fibonacci Series: ");
		for(int n:fib){	
			System.out.print(n + " ");
		}
	}	
}
