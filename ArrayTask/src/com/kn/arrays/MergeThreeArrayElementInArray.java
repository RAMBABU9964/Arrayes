package com.kn.arrays;
import java.util.Scanner;
public class MergeThreeArrayElementInArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Declaration And Creation
		System.out.println("Enter first Array Size=");
		int n1=scan.nextInt();
		System.out.println("Enter Second Array Size=");
		int n2=scan.nextInt();
		System.out.println("Enter Third Array Size=");
		int n3=scan.nextInt();
		int[]arr=new int[n1];
		int[]brr=new int[n2];
        int[]crr=new int[n3];
		//Array Initilazation
		System.out.println("Enter "+n1+" values for array arr");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
			System.out.println("Enter "+n2+" values for array brr");
			for(int i=0;i<brr.length;i++) {
				brr[i]=scan.nextInt();
			}	
				System.out.println("Enter "+n3+" values for array crr");
				for(int i=0;i<crr.length;i++) {
					crr[i]=scan.nextInt();
		}scan.close();
			//Methed Creating for crr Array
		int[] drr=mergeThreeArray(arr,brr,crr);
		//Array Travering
		System.out.println("Merged array is:");
		for(int i=0;i<drr.length;i++) {
			System.out.print(drr[i]+" ");
		}
	}
	//Returning the Method To print the drr
	public static int[] mergeThreeArray(int[] arr, int[] brr, int[] crr) {
		int[]drr=new int[arr.length+brr.length+crr.length];
		
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			drr[arr.length+i]=brr[i];
		}
		for(int i=0;i<crr.length;i++) {
			drr[arr.length+brr.length+i]=crr[i];
		}
		return drr;
	}
}
