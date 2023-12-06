package com.kn.array;

import java.util.Scanner;

public class ArrayDividedBy3Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array Creation
        
         System.out.println("Enter the size of an array");
         int[] arr = new int[scan.nextInt()];
         
         //Array Initialization
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("Enter the number=");
        	 arr[i]=scan.nextInt();
         }
         System.out.println("Array data as follows:");
         //Array Traversing
         for(int i=0;i<arr.length;i++) {
          if(arr[i]%3==0) {
           System.out.println("The given Number is divided by three ="+arr[i]);
          }else {
        	  System.out.println("Not divided by three="+arr[i]);
          }
         }scan.close();
         }
}
