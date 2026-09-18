package day15;

import java.util.Arrays;

public class 배열레퍼런스 {
	static void plusArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
	}
	
//	static int[] plusArr(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] += 1;
//		}
//		return arr;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
//		int newArr[] = plusArr(arr);
//		System.out.println(Arrays.toString(newArr));
		plusArr(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
