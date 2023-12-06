package com.kn.arrays;
import java.util.Scanner;
public class BubbleSortArrayDemo {
	public static void main(String[] args) {
		//Array Declaration,Creation,Initilazation
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size=");
		int size=scan.nextInt();
		int[]arr=new int[size];
		//int[]arr= {48,32,64,9,17,96,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter"+(1+i)+"Array Element");
			arr[i]=scan.nextInt();
		}
		//Before The Sorting
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		//Object creation to call method
		BubbleSortArray bubbleSortArray=new BubbleSortArray();
		//int[] crr = bubbleSortArray.printBubbleShort(arr);
		System.out.println();
		//Ofter The Sorting
		System.out.println("After Sorting");
		for(int i:bubbleSortArray.printBubbleShort(arr)) {
			System.out.print(i+" ");
		}
}}