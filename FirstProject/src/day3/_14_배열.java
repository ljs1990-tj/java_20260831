package day3;

import java.util.Arrays;
import java.util.Random;

public class _14_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5]; // {0, 0, 0, 0, 0}
		// 5개 공간을 가지는 숫자(int)형 배열에 
		// 1~10사이의 랜덤한 숫자를 채우기
		Random ran = new Random();
	
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
		}
		// # 참고, Arrays.toString();
		System.out.println(Arrays.toString(arr));
		
	}
}
