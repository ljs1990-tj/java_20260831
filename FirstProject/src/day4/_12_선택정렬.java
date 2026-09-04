package day4;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,6,7,3,5};
		
		// arr에서 가장 작은 숫자를 찾아서 맨 앞에 숫자랑 자리 바꾸기
		// 1회차 : {9,6,7,3,5} => {3,6,7,9,5}
		// 2회차 : {3,6,7,9,5} => {3,5,7,9,6}
		// 3회차 : {3,5,7,9,6} => {3,5,6,9,7}
		// 4회차 : {3,5,6,9,7} => {3,5,6,7,9}
		
		// 배열의 크기가 100이라면
		// 99번 반복문 쭉 작성?
		// 아래 코드를 반복문 안의 반복문으로 처리
		
		int minIndex = 0; // 가장 작은 값의 위치
		for(int i=1; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		System.out.println(Arrays.toString(arr));
		
		
		minIndex = 1; // 두번째 작은 값의 위치
		for(int i=2; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[1];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		minIndex = 2; 
		for(int i=3; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));
		
		minIndex = 3; 
		for(int i=4; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[3];
		arr[3] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
