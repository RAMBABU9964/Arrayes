package com.kn.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//Array Declaration
		int[] arr;
		
		//Array Creation
		arr=new int[5];
		
		//Array Initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
        
		//Array Traversing
		for(int i=0;i<=4;i++) {
			//or
	  //for(int i=0;i<=arr.Length-1;i++){
			System.out.println(arr[i]);
		}
	}

}
