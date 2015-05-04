package com.bayamp.tests;

public class BayAmpUtils {

	public static String reverse(String inputString) {
		// TODO Auto-generated method stub
		String[] s=inputString.split(" ");
		String outputString="";
		for(int i=s.length-1; i>=0; i--){
			outputString=outputString + s[i] +" ";
		}
		return outputString.trim();
	}

}
