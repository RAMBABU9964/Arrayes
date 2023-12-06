package com.kn.array;

import java.util.Scanner;

public class ArrayDemoSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array Creation
        
         System.out.println("Enter the size of an array");
         int[] arr = new int[scan.nextInt()];
         
         //Array Initialization
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("Enter the data=");
        	 arr[i]=scan.nextInt();
         }
         System.out.println("Array data as follows");
         //Array Traversing
         int sum=0;
         for(int i=0;i<arr.length;i++) {
           sum=sum+arr[i];
           System.out.println(sum);
         }scan.close();
         }}
