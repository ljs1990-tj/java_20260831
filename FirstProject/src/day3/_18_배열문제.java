package day3;

import java.util.Arrays;
import java.util.Random;

public class _18_배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 6개의 공간을 가지는 int형 배열을 만든 후
		//    1부터 100사이의 랜덤한 숫자를 넣어주세요.
		//    단, 홀수만 넣을 것.
		Random ran = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) { 
			int ranNum = ran.nextInt(100) + 1;
			if(ranNum % 2 == 1) {
				arr[i] = ranNum;
			} else {
				i--; 
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 2. 1번에서 만든 배열의 숫자들의 평균을 구하기.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length);
		
		// 3. 1번에서 만든 배열에서 가장 큰 숫자와 가장 작은 숫자의
		// 위치를 바꾸기
		// ex) [85, 67, 53, 37, 29, 11] => [11, 67, 53, 37, 29, 85]
		// 중복된 숫자가 있으면 먼저 나온 숫자를 기준으로 하면 됩니다.
		
		int maxIndex = 0; // 가장 큰 숫자의 위치
		int minIndex = 0; // 가장 작은 숫자의 위치
		for(int i=1; i<arr.length; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
