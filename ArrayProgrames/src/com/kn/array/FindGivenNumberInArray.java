package com.kn.array;
import java.util.Scanner;
public class FindGivenNumberInArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//declaration and creation of array
	System.out.println("Enter the size of the number=");
	int[]arr =new int[scan.nextInt()];
	//Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the number for "+(i+1)+" = ");
		 arr[i]=scan.nextInt();
	}
	//Array Traversing
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the number to find=");
		int num = scan.nextInt();
		//Method to find given number in given Array
		boolean isNumberFound=findNumberInArray(arr,num);
		System.out.println("The number "+num+" Is found = "+ isNumberFound);
	}scan.close();
	}
	//Return the method to find the given number in given Array
    public static boolean findNumberInArray(int[] arr, int num) {
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
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
10
Enter the number for 2 = 
20
Enter the number for 3 = 
30
Enter the number for 4 = 
40
Enter the number for 5 = 
50
Enter the number to find=
60
The number 60 Is found = false
Enter the number to find=
50
The number 50 Is found = true
Enter the number to find=
40
The number 40 Is found = true
Enter the number to find=
30
The number 30 Is found = true
Enter the number to find=
80
The number 80 Is found = false
*/