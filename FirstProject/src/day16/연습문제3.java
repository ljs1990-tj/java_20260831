package day16;

import java.util.ArrayList;
import java.util.Arrays;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arr[] = {3,5,2,4,6,9,8}
		// 배열에서 홀수와 짝수들의 합의 차이 구하기
		// 차이는 무조건 양수로 나오도록
		int arr1[] = {3,5,2,4,6,9,8};
		int oddSum = 0;
		int evenSum = 0;
		for(int num : arr1) {
			if(num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}
		System.out.println(Math.abs(oddSum - evenSum));
		
		
		int arr[] = {3,5,-1, -7, 6};
		// 음수를 무시하고 오름차순
		// {-1, 3, 5, 6, -7}
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				list.add(arr[i]);
			}
			arr[i] = Math.abs(arr[i]);
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(list.contains(-arr[i])) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
//		for(int j=0; j<arr.length-1; j++) {
//			int minIndex = j; // 가장 작은 값의 위치
//			for(int i=j+1; i<arr.length; i++) {
//				if(Math.abs(arr[minIndex]) > Math.abs(arr[i])) {
//					minIndex = i;
//				}
//			}
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[j];
//			arr[j] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
	}
}
