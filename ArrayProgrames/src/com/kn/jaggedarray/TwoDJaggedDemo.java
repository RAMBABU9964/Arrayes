package com.kn.jaggedarray;

import java.util.Scanner;

public class TwoDJaggedDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array Declaration
	      int [][]arr;
	    //Array Creation
	      arr=new int[2][];
	      arr[0]=new int[3];
	      arr[1]=new int[2];
	      
	      //Array initalization
	      for(int i=0;i<arr.length;i++) {
	    	  System.out.println("1D Array "+(i+1)+" Data");
	    	  for(int j=0;j<arr[i].length;j++) {
	    		  System.out.println("Enter the data "+(j+1)+" Element=");
	    		  arr[i][j]=scan.nextInt();
	    	  }
	      }scan.close();
	      //Array Travering
	      System.out.println("1D Array Data");
	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=0;j<arr[i].length;j++) {
	    		  System.out.println(arr[i][j]);
	    	  }
	      }
}}
/*output:
 1D Array 1 Data
Enter the data 1 Element=
10
Enter the data 2 Element=
20
Enter the data 3 Element=
30
1D Array 2 Data
Enter the data 1 Element=
40
Enter the data 2 Element=
50
1D Array Data
10
20
30
40
50
*/
