package com.kn.arrays;

public class CountEvenAndOddElement {
	//Method to print the behaviour
	public void printEvenAndOddArrayElements(int[]arr) {
		System.out.println("************");
		System.out.println("Array of even and odd count elementare as followes");
		int evencount=0,oddcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount=evencount+1;
			}else {
				oddcount=oddcount+1;
				
			}
		}System.out.println("Even Number="+evencount);
		System.out.println("Odd Number="+oddcount);
}}
