package com.kn.array;

import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array Creation
        
         System.out.println("Enter the size of an array");
         String[] arr = new String[scan.nextInt()];
         
         //Array Initialization
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("Enter String data=");
        	 arr[i]=scan.next();
         }
         System.out.println("Array data is follows:");
         //Array Traversing
         for(int i=arr.length-1;i>=0;i--) {
        	 System.out.println(arr[i]);
         }scan.close();
	}

}
