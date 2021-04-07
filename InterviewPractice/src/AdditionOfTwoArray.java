import java.util.Arrays;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,43,23,35,21,2,5,6};
		int arr2[]= {2,5,78,54,34,56,90,21};
		int arr3[]=new int[arr1.length+arr2.length];
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
			count++;
		}
		System.out.println(count);
		for(int i=count,j=0;j<arr2.length;i++,j++) {
			arr3[i]=arr2[j];
		}
		
		for(int ele : arr3)
			System.out.println(ele);

	}

}
