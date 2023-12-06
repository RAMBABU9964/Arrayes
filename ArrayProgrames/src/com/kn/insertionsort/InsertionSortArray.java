package com.kn.insertionsort;

import java.util.Scanner;

public class InsertionSortArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array=");
		int[]arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(1+i)+" Array Element");
			arr[i]=scan.nextInt();
			
			
			}scan.close();
			//
			int temp=0;
			for(int i=1;i<arr.length;i++) {
				int j=i-1;
				temp=arr[i];
				//Swapping Element for min value
				while(j>=0&&arr[j]>temp) {
					arr[j+1]=arr[j];
					j--;
			}
				arr[j+1]=temp;
			}
			System.out.println("Array Element After Sorting..");
			for(int x:arr) {
				System.out.print(x+" ");
			}
		}
	}


