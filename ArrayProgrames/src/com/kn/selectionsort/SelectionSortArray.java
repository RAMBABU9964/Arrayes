package com.kn.selectionsort;

import java.util.Scanner;

public class SelectionSortArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array=");
	int[]arr=new int[scan.nextInt()];
	
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter "+(1+i)+" Array Element");
		arr[i]=scan.nextInt();
		
		
		}scan.close();
		//
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
			//Swapping Element for min value
			temp=arr[i];
			arr[i]=arr[indix];
			arr[indix]=temp;
		}
		System.out.println("Array Element After Sorting..");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}

