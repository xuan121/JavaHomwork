package com.bayamp.string;

//convert string to int with and w/o built-in method
public class ConvertStringToInt {
	public static void main(String[] args){

		//code: checks ASCII; String '0'=48; '1'=49...
		/*String s="123450";
		char[] ch=s.toCharArray();
		int[] in=new int[6];
		for(int i=0; i<s.length(); i++){
			in[i]=(int)ch[i];
			System.out.println(in[i]);
		}*/
		
		String num1=new String("12345");
		int n1=convert(num1);
		System.out.println("Using Parse Method to convert: "+n1);
		String num2=new String("567890");
		int n2=convert2(num2);
		System.out.println("Using Parse Method to convert: "+n2);
	}
	private static int convert(String s){
		int num=Integer.parseInt(s);
		return num;
	}
	private static int convert2(String s){
		char[] ch=s.toCharArray();
		int zero=(int)'0';
		int sum=0;
		for(char c:ch){
			int num=(int)c;
			sum=(sum*10)+(num-zero);
		}
		return sum;
	}
}
