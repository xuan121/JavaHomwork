package com.bayamp.string;

import java.util.Arrays;

public class CheckAnagram {
	public static void main(String[] args){
		String s1=new String("checkswhatever");
		String s2=new String("whatckcheerevs");
		if(isAnagram(s1,s2)) System.out.println(s1+" and "+s2+" are anagram!");
		else 		System.out.println(s1+" and "+s2+" are not anagram!");;
	}
	private static boolean isAnagram(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		if(s1==null||s2==null) return false;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0; i<ch1.length;i++){
			if(ch1[i]!=ch2[i]) return false;
		}
		return true;
	}
}
