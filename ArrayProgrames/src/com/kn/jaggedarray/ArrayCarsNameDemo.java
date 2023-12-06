package com.kn.jaggedarray;
import java.util.Scanner;
public class ArrayCarsNameDemo {
      public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    	   System.out.println("Enter the Numbers of Company=");
           int numOfCompany=scan.nextInt();
         
           String[][]arr=new String[numOfCompany][];
           
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Enter car company name"+(i+1)+" =");
        	   String companyName=scan.next();
        	   
        	   System.out.println("Enter the numbers of car modules for "+companyName+" =");
        	   int numModeles=scan.nextInt();
        	   arr[i]=new String[numModeles+1];
        	   arr[i][0]=companyName;
        	   for(int j=0;j<arr[i].length;j++) {
        		   System.out.println("Enter the car model "+j+" for "+companyName+": ");
        	   arr[i][j]=scan.next();
        	   }
           }
           System.out.println("Car company and Models:");
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Company name"+arr[i]+" =");
        	   for(int j=0;j<arr[i].length;j++) {
        		   System.out.println(arr[i][j]);
        	   }
           }
       }
       
	}
