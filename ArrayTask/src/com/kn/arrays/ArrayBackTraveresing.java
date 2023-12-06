package com.kn.arrays;

public class ArrayBackTraveresing {
	public void printArrayBackWorldElements(int[]arr) {
		System.out.println("************");
		System.out.println("Array elementare as followes");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
