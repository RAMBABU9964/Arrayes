package com.kn.arrays;

import java.util.Scanner;

public class ArrayBackWordTraveresing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size=");
		//Array Declaration & Creation
		int[]arr=new int[scan.nextInt()];
		
		//Array Initilazation
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+" array element=");
			arr[i]=scan.nextInt();
		}scan.close();
		//Object creation to call method
		ArrayBackTraveresing arrayTraveresing=new ArrayBackTraveresing();
		arrayTraveresing.printArrayBackWorldElements(arr);
	}
}
