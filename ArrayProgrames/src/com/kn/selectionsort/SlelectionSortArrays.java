package com.kn.selectionsort;

public class SlelectionSortArrays {
public int[] printSelectionSort(int[]arr){
	int min=0;
	int indix=0;
	int temp=0;
	for(int i=0;i<arr.length-1;i++) {
		min=arr[i];
		indix=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
				indix=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[indix];
		arr[indix]=temp;
	} 
	return arr;
	
}
}
