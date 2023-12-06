package com.kn.arrays;
import java.util.Scanner;
public class MergeTwoArrayElement {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//Declaration And Creation
	System.out.println("Enter first Array Size=");
	int n1=scan.nextInt();
	System.out.println("Enter Second Array Size=");
	int n2=scan.nextInt();
	int[]arr=new int[n1];
	int[]brr=new int[n2];
	//Array Initilazation
	System.out.println("Enter "+n1+" values for array arr");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
		System.out.println("Enter "+n2+" values for array arr");
		for(int i=0;i<brr.length;i++) {
			brr[i]=scan.nextInt();
	}scan.close();
		//Methed Creating for crr Array
	int[] crr=mergeTwoArray(arr,brr);
	//Array Traversing
	System.out.println("Merged array is:");
	for(int i=0;i<crr.length;i++) {
		System.out.print(crr[i]+" ");
	}
}
//Method Return for crr Array
public static int[] mergeTwoArray(int[] arr, int[] brr) {
	int[]crr=new int[arr.length+brr.length];
	
	for(int i=0;i<arr.length;i++) {
		crr[i]=arr[i];
	}
	for(int i=0;i<brr.length;i++) {
		crr[arr.length+i]=brr[i];
	}
	return crr;
}
}
