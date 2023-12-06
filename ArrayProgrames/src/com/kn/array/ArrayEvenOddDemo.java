package com.kn.array;

import java.util.Scanner;

public class ArrayEvenOddDemo {
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
         for(int i=0;i<arr.length;i++) {
          if(arr[i]%2==0) {
           System.out.println("even="+arr[i]);
          }else {
        	  System.out.println("odd="+arr[i]);
          }
         }scan.close();
         }
}
