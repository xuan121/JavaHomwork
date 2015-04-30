package com.bayamp.array;

public class SortArray {
	public static void bubbleSort(int[] intArray){
		int temp;
		for(int i=0; i<intArray.length; i++){
			for(int j=1; j<(intArray.length-i); j++){
				if(intArray[j-1]>intArray[j]){
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
	}
// someting wrong with quickSort method	
	public static void main(String[] args){
		int[] n={1,12,6,8,9};
		quickSort(n,0,n.length-1);
		for(int i:n){
			System.out.print(i+" ");
		}
		
	}
	public static int partition(int[] intArr, int low, int high){
		int i=low;
		int j=high;
		int pivot=intArr[(i+j)/2];
		while(i<j){
			while(intArr[i]<pivot) i++;
			while(intArr[j]>pivot) j--;
			if(i<j){
				int temp=intArr[i];
				intArr[i]=intArr[j];
				intArr[j]=temp;
				i++;
				j--;
			}
		}
		return i;
	}
	public static void quickSort(int arr[], int left, int right){
		int index=partition(arr,left,right);
		if(left<index-1) quickSort(arr,left,index-1);
		if(index<right) quickSort(arr,index,right);
	}
}
