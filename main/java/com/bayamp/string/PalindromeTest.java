package com.bayamp.string;

public class PalindromeTest {
	public static void main(String[] args){
		String s=new String("runnur");
		if(isPalindrome(s)) System.out.println(s+" is palindrome");
		else System.out.println(s+" is not palindrome");
	}
	private static boolean isPalindrome(String s){
		if(s==null) return false;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=(s.charAt(s.length()-1-i))) return false;
		}
		return true;
	}
}
