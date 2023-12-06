package com.kn.jaggedarray;

import java.util.Scanner;

public class JaggedBatchFrindsNameDemo {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of Batches=");
	int numberOfBatches=scan.nextInt();
	//Array Declaration & Creation
			String[][]arr=new String[numberOfBatches][];
			System.out.println("Enter the number of Students in the batches");
			/*arr[0]=new String[2];
			arr[1]=new String[2];
			arr[2]=new String[4];*/
			for(int i=0;i<arr.length;i++) {
				arr[i]=new String[scan.nextInt()];
			}
			
			 //Array initalization
			 for(int i=0;i<arr.length;i++) {
		    	  System.out.println("Batch "+((char)(i+ 65)));
		    	  for(int j=0;j<arr[i].length;j++) {
		    		  System.out.println("Enter the Student "+(j+1)+" Name=");
		    		  arr[i][j]=scan.next();
		    	  }}scan.close();
			//Array Travering
		      System.out.println("Enter The Array Data");
		      for(int i=0;i<arr.length;i++)
		      {System.out.println("Batch "+((char)(i+65)));
		    	  for(int j=0;j<arr[i].length;j++) {
		    		  System.out.println("Student"+(j+1)+"Name ="+arr[i][j]);
	}}
}}