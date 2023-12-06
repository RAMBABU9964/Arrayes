package com.kn.array;

public class BubbleSortArrays {

	public static void main(String[] args) {
		int[]arr= {15,16,6,8,5};
		
		
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
		
		for(int j=0;j<arr.length-1-i;j++) {
			int temp=0;
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count=1;
			}
		}
		if(count==0) {
				break;
			}
			}
		
		System.out.println();
		System.out.println("After Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
