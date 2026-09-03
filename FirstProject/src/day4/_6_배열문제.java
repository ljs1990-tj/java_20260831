package day4;

import java.util.Arrays;
import java.util.Random;

public class _6_배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개 공간에 1부터 45사이의 랜덤한 숫자 넣기
		// 중복허용 x 
		Random ran = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) { 
			int ranNum = ran.nextInt(45) + 1;
			arr[i] = ranNum;
			for(int j=0; j<i; j++) {
				if(ranNum == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
