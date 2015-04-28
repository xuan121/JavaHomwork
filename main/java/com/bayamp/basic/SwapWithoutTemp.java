package com.bayamp.basic;

public class SwapWithoutTemp {
	public static void main(String[] args){
		int x = 20;
		int y = 50;
		System.out.println("Before the swap...");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After the swap...");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
}
