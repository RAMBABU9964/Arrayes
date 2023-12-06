package com.kn.array3d;
import java.util.Scanner;
public class Array3DDemo3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int size=scan.nextInt();
		//Array Declaration & Creatione
		int[][][]arr=new int[size][][];
		
		System.out.println("Enter the 2 Size=");
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[scan.nextInt()][];
			}
			System.out.println("Enter the 3 size=");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
						arr[i][j]=new int[scan.nextInt()];
					}
				}
			//Array initialization
			System.out.println("Enter data for array element:");
	    	for(int i=0;i<arr.length;i++) {
	   			for(int j=0;j<arr[i].length;j++) {
	      		for(int k=0;k<arr[i][j].length;k++) {
	      			arr[i][j][k]=scan.nextInt();
	   	}
	  	}
	  }
	          //Array Traversing
	      	System.out.println("************");
	      for(int i=0;i<arr.length;i++) {
	   		for(int j=0;j<arr[i].length;j++) {
	   			for(int k=0;k<arr[i][j].length;k++) {
	      			System.out.println(arr[i][j][k]);
	      				}}
	      				}scan.close();	
		
}
}