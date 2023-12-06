package com.kn.arraybinery;
public class ArrayBineryElementChack {
	//Method call of object
	public void printArrayBineryElements(int[]arr,int element) {
		int low=0;
		int high=arr.length;
		int mid=0;
		boolean isFoundElement=false;
		int position=-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				isFoundElement=true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid]) {
				low=mid+1;
				high=high;
			}else {
				high=mid-1;
				low=low;
	}
			}
			if(isFoundElement) {
				System.out.println("Element "+element+" is found at "+position+" position");
			}else {
				System.out.println("Element "+element+" is not found");
			}
	
	}
	}
