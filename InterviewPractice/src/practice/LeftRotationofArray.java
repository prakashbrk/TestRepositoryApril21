package practice;

import java.util.Arrays;
//Left Rotation of Array
public class LeftRotationofArray {

	public static void main(String[] args) {
		
		int arr[]=new int[]{2,3,4,5,6,2,8};
		System.out.println(Arrays.toString(arr));
		int noOfR=1;
		int n=arr.length;
		for(int r=1;r<=noOfR;r++) {
			int j;
			j=arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[n-1]=j;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
