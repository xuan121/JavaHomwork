package com.bayamp.array;

//only one problem: if there is " ",
//the program counts it as well
public class CheckCharacter {
	public static void main(String[] args){
		String s="Todayissunny";
		int count=1;
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++){
			for(int j=i+1; j<ch.length-1;j++){
				if(ch[i]==ch[j]) count++;
			}
			if(count>1) System.out.println(ch[i]+" appears "+count);
			count=1;
		}
	}
}
