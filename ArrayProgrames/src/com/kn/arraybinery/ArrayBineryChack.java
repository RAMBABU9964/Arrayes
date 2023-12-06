package com.kn.arraybinery;
import java.util.Scanner;
public class ArrayBineryChack {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Declaration & Creation & initilazation
		int[]arr= {10,20,30,40,50,60,70,80,90,100,110,120};
		
		System.out.println("Enter the Element=");
		int element=scan.nextInt();
		scan.close();
		//Object Creation
			ArrayBineryElementChack arrayBineryElementChack=new ArrayBineryElementChack();
			arrayBineryElementChack.printArrayBineryElements(arr, element);;
			
		}

	

}
