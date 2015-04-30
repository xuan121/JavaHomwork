package com.bayamp.array;

public class LinearSearch {
	public static void main(String[] args){
		int target=9;
		int[] intArray={1,6,3,5,7};
		if(isLinearSearch(intArray,target)) System.out.println("Got it!");
		else System.out.println("Nooop!");
		
	}
	private static boolean isLinearSearch(int[] intArr, int num){
		for(int i=0; i<intArr.length; i++){
			if(num==intArr[i]) return true;
		}
		return false;
	}
}
