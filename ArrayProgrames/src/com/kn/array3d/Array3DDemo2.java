package com.kn.array3d;
import java.util.Scanner;
public class Array3DDemo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array Declration
		int [][][]arr;
		//Array Creation
		arr=new int[4][][];
        arr[0]=new int[3][];
        arr[0][0]=new int[1];
        arr[0][1]=new int[2];
        arr[0][2]=new int[3];
        
        arr[1]=new int[1][];
        arr[1][0]=new int[2];
        
        arr[2]=new int[2][];
        arr[2][0]=new int[1];
        arr[2][1]=new int[1];
        
        arr[3]=new int[3][];
        arr[3][0]=new int[1];
        arr[3][1]=new int[2];
        arr[3][2]=new int[3];
        
        
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
