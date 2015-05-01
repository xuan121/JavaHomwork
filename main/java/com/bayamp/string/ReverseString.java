package com.bayamp.string;

//Reverse "one two three four" to "three four one two"
public class ReverseString {
	public static void main(String[] args){
		String s1=new String("one two three four");
		System.out.println("The original array is "+ s1);

//For correction
/*		String[] str1=s1.split(" ");
		int length=str1.length/2;
		int j=0;
		int i=0;
		String[] newArray=new String[length];
		String[] outputArray=new String[length];
		while(i<length){
			while(j<str1.length){
				newArray[i]=str1[j]+" "+str1[j+1];
				j=j+2;
				i++;
			}
		}
		for(int k=0; k<length; k++){
			outputArray[k]=newArray[length-1-k];
		}
		
		System.out.println(str1.length);
		System.out.println(newArray[1]);
		for(String o1:str1){
			System.out.println(o1);
		}
		for(String sw1:newArray){
			System.out.println(sw1);
		}
		for(String so1:outputArray){
			System.out.println(so1);
		}*/
		
		String[] so1=reverseString(s1);
		for(String str1:so1){
			System.out.println(str1);
		}
		
		String s2=new String("one two three four five six");
		System.out.println("The original array is "+ s2);
		String[] so2=reverseString(s2);
		for(String str2:so2){
			System.out.println(str2);
		}
	}
	
	private static String[] reverseString(String s){
		String[] str=s.split(" ");
		int length=str.length/2;
		int j=0;
		int i=0;
		String[] newArray=new String[length];
		String[] outputArray=new String[length];
		while(i<length){
			while(j<str.length){
				newArray[i]=str[j]+" "+str[j+1];
				j=j+2;
				i++;
			}
		}
		for(int k=0; k<length; k++){
			outputArray[k]=newArray[length-1-k];
		}
		return outputArray;
	}
}
