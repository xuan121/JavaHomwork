package com.bayamp.array;

public class RemoveDuplicate {
	public static void main(String[] args){
		int[] input={1,4,7,2,1,9,6,6,8,6};
		int count=1;
		sort(input);
		System.out.println("The original sorted array: ");
		for(int i:input){
			System.out.print(i+" ");
		}
		for(int i=1; i<input.length;i++){
			if(input[i-1]!=input[i]) count++;
		}
		int[] output=new int[count];
		int j=0;
		System.out.println("\nThe new array: ");
		for(int i=1; i<input.length; i++){
			output[0]=input[0];
			if(input[i-1]!=input[i]){
				j++;
				output[j]=input[i];
			}
		}
		for(int k:output){
			System.out.print(k+" ");
		}
	}
	private static void sort(int[] input){
		int temp;
		for(int i=0; i<input.length;i++){
			for(int j=1; j<input.length-i;j++){
				if(input[j-1]>input[j]){
					temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
				}
			}
		}
	}
}
