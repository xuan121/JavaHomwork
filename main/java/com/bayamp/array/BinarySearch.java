package com.bayamp.array;


public class BinarySearch {
	public static void main(String[] args){
		int[] numArr={9,5,6,1,16,4,2,9,61,36};
		int num=100;
		
		//use the SortArrayclass I built
		//??question is why have to use for loop, or print hashcode
		SortArray.bubbleSort(numArr);
		System.out.println("The sorted array is ");
		for(int i:numArr){
			System.out.print(i+" ");
		}
		System.out.println();
		if (binarySearch(numArr,num)){
			System.out.println("The number "+num+" is in the array");
		}
		else
			System.out.println("The number does not in array");
	}
	private static boolean binarySearch(int[] array, int target){
		int lowest=0;
		int highest=array.length-1;	
		while(lowest<=highest){
			int middle=(lowest+highest)/2;
			if(target==middle) return true;
			else if(target<middle) highest=middle-1;
			else lowest=middle+1;
		}
		return false;
	}
}
