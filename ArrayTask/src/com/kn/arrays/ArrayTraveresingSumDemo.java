package com.kn.arrays;

import java.util.Scanner;

public class ArrayTraveresingSumDemo {
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
		//Create Object of ArrayTraveresingSum
		ArrayTraveresingSum arrayTraveresingSum=new ArrayTraveresingSum();
		System.out.println("The sum array Element="+arrayTraveresingSum.printArraySumElement(arr));
}}
