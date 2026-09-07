package day6;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {
	
	// 생성자를 private으로 막으면 객체 생성이 불가능
	private ArrayFunc(){};
	
	static void arrayMax(int[] arr) {
		// arr = {3,5,2,4,1}
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("배열에서 가장 큰 값은 " + max + " 입니다");
	}
	
	static int arraySum(int[] arr) {
		// arr = {3,5,2,4,1}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static int arrayChoice(int[] qqq, int loc) {
		// qqq = {3,5,2,4,1}
		return qqq[loc-1];
	}

	static void arrayRandom(int x) {
		int arr[] = new int[x];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}


