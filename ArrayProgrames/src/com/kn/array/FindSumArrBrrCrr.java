package com.kn.array;
public class FindSumArrBrrCrr {
	public static void main(String[] args) {
		//Array Declaration Creation Initilazation
		int[][]arr= {{10,20,30,40,50},{50,40,30,20,10}};
		int[][]brr= {{50,40,30,20,10},{10,20,30,40,50}};
		//Method Creating for finding crr:
		find2DArrayElementSum(arr,brr);
	}
     //Method for finding crr:
	public static void find2DArrayElementSum(int[][] arr, int[][] brr) {
		int[][]crr=new int[arr.length][arr[0].length];
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
			}
				
		}
		//Array Travering
		System.out.println("int[][] crr=");
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
		System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
