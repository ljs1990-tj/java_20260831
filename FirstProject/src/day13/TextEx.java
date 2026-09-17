package day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class TextEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 20개의 공간을 가지는 배열을 생성하고, 
		// 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//
//		1) 각 숫자의 개수를 출력하시오.
//		답변 예시 : '1 : 6개, 2 : 3개, 3 : 5개, ... 10 : 2개'
		Random ran = new Random();
		int arr[] = new int[20];
		int numArr[] = new int[10];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
//			numArr[arr[i]-1] += 1;
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		System.out.println(map);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(numArr));
	}

}
