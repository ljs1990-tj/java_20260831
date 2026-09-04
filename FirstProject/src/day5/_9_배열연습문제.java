package day5;

import java.util.Arrays;

public class _9_배열연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayFunc obj = new ArrayFunc();
		int arr[] = {3,5,2,4,1};
		
		// 1.
		obj.maxMinChange(arr); // 가장 큰 값과 작은 값의 위치 바꾸기
		
		// 가장 큰 값과 작은 값의 위치 바뀐결과 출력
		// {3,1,2,4,5};
		System.out.println(Arrays.toString(arr)); 
		
	}
}
