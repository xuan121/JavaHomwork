package com.bayamp.string;

//calculate length of string w/o using built-in method
public class LengthString {
	public static void main(String[] args){
		String s=new String("Love to travel");
		int counter=0;
		char[] ch=s.toCharArray();
		for(char c:ch){
			counter++;
		}
		System.out.println("The length of string is "+counter);
	}
}
