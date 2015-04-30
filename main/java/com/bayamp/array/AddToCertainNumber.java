package com.bayamp.array;

public class AddToCertainNumber {
	public static void main(String[] args){
		int[] arr={9,6,1,5,10,5,3,12};
		int num=15;
		sort(arr);
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if((num-arr[i])==arr[j]) System.out.println(arr[i]+" "+arr[j]+" is "+num);
			}
		}
	}
	private static void sort(int[] input){
		int temp;
		for(int i=0; i<input.length; i++){
			for(int j=1; j<input.length-i; j++){
				if(input[j-1]>input[j]){
					temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
				}
			}
		}
	}
}
