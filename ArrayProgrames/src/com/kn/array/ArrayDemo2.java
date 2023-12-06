package com.kn.array;
import java.util.Scanner;
public class ArrayDemo2 {
   public static void main(String[] args) {
		//Array Declaration
	   float[] frr=new float[3];
	   
	   //Array Creation
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter Data= ");
	  float f1=scan.nextFloat();
	  frr[0]=f1;
	  
	  System.out.println("Enter Data= ");
	  float f2=scan.nextFloat();
	  frr[1]=f2;
	  
	  System.out.println("Enter Data= ");
	  float f3=scan.nextFloat();
	  frr[2]=f3;
	  
	  //Array Traversing
	  System.out.println("Data within Array as follows :");
	  for(int i=0;i<=frr.length-1;i++) {
		  System.out.println(frr[i]);
	  }scan.close();
	}

}
