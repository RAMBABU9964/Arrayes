package com.kn.selectionsort;
import java.util.Scanner;
public class SlectionSortArraysDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array=");
		int[]arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(1+i)+" Array Element");
			arr[i]=scan.nextInt();
}scan.close();
		System.out.println("Array Element Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		SlelectionSortArrays slelectionSortArrays=new SlelectionSortArrays();
		System.out.println();
		System.out.println("Array Element After Sorting..");
		for(int x:slelectionSortArrays.printSelectionSort(arr)) {
			System.out.print(x+" ");
		}
	}}
