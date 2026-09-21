package day16;

import java.util.Arrays;
import java.util.Comparator;

public class 예시문제 {
	public static void negativeArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		// 주어진 배열을 내림차순
		negativeArr(arr);
		Arrays.sort(arr);
		negativeArr(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer arr2[] = {3,5,2,4,1};
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		int arr3[] = {3,5,2,4,1};
		// 배열에서 가장 큰 값과 가장 작은 값의 차이를 구해라
		Arrays.sort(arr3);
		System.out.println(arr3[arr3.length-1] - arr3[0]);
		
 		
		
	}
}
