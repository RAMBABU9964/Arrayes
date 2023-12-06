package com.kn.insertionsort;

public class InsertionSortArrays {
public int[]printInsertionSort(int[]arr){
	int temp=0;
	for(int i=1;i<arr.length;i++) {
		int j=i-1;
		temp=arr[i];
		while(j>=0&&arr[j]>temp) {
			arr[j+1]=arr[j];
			j--;
	}
		arr[j+1]=temp;
	}
	return arr;
	
}
}
