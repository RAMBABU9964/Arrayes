package com.kn.array;

import java.util.Scanner;

public class MissingElementArrays {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size=");
	int num=scan.nextInt();
     int[]arr=new int[num];
	for(int i=0;i<arr.length;i++) {
   	 System.out.println("Enter the data=");
	arr[i]=scan.nextInt();
	int k=0;
	for(int i1=0;i1<arr.length;i1++) {
		for(int j=i1+1;j<arr.length;j++) {
			if(arr[i1]==arr[j]) {
				k=j;
				break;
			}
			
			}
		} 
	System.out.println(arr[k]);
	}
}}

