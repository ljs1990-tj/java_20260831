package day4;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {
	
	void arrayMax(int[] arr) {
		// arr = {3,5,2,4,1}
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("배열에서 가장 큰 값은 " + max + " 입니다");
	}
	
	int arraySum(int[] arr) {
		// arr = {3,5,2,4,1}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	int arrayChoice(int[] qqq, int loc) {
		// qqq = {3,5,2,4,1}
		return qqq[loc-1];
	}

	void arrayRandom(int x) {
		int arr[] = new int[x];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}


