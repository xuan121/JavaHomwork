package com.bayamp.basic;

//??When using swap method, not working
public class SwapWithTemp {
	public static void main(String[] args){
		String s1="This is the 1st String";
		String s2="This is the 2nd String";
		System.out.println("The original S1: "+s1);
		System.out.println("The original S2: "+s2);
		//swap(s1,s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After the swap...");
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
	}
	/*private static void swap(String str1, String str2){
		String temp=str1;
		str1=str2;
		str2=temp;
	}*/
}
