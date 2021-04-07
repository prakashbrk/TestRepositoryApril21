package practice;

import java.util.Arrays;

public class EliminateDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr[]= {1,-22,2,4,56,23,2,10,34,23,1,56,10,14};
		//Need to sort the array first to remove the duplicate values
		Arrays.sort(arr);
		for(int e:arr) {
			System.out.print(e + " ");	
		}
		System.out.println();
		
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
			
		}
		arr[j++]=arr[arr.length-1];
		
		for(int k=0;k<j;k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
