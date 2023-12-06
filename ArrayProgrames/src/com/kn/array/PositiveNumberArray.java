package com.kn.array;

import java.util.Scanner;

public class PositiveNumberArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//declaration and creation of array
	System.out.println("Enter the size of the number=");
	int[]arr =new int[scan.nextInt()];
	//Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the number for "+(i+1)+" = ");
		int num=scan.nextInt();
		// Method to find given number is positive in given Array
		boolean isNumberPositive=findPositiveNumber(arr,num);
		System.out.println("The number "+num+" Is positive number = "+ isNumberPositive);
	}scan.close();
	
	}
    //Return method to find given number is given array
	public static boolean findPositiveNumber(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(num>0) {
				return true;
			}
		}
		return false;
	}
}
/*output:
 Enter the size of the number=
5
Enter the number for 1 = 
1
The number 1 Is positive number = true
Enter the number for 2 = 
-5
The number -5 Is positive number = false
Enter the number for 3 = 
6
The number 6 Is positive number = true
Enter the number for 4 = 
4
The number 4 Is positive number = true
Enter the number for 5 = 
-45
The number -45 Is positive number = false
*/
