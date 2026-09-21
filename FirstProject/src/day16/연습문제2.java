package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		// 1. 스캐너를 통해 숫자 5개 입력받아서 배열에 넣기
//		// 양수를 입력하면 음수로, 음수를 입력하면 양수로 넣기
//		// ex) 5 => -5, -3 => 3
//		for(int i=0; i<arr.length;i ++) {
//			System.out.print((i+1) + "번째 숫자 : ");
//			int input = s.nextInt();
//			arr[i] = -input;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		int arr2[] = {30, 20, 60, 15, 25, 20, 60, 15, 10, 30};
		// 2. 배열에서 중복된 값 제거 후 출력
		// 결과(순서상관없음) : { 30, 20, 60, 15, 25, 10 }
		// 단, 배열에 0은 없다고 가정해도 좋음.
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr2.length; i++) {
			if(!list.contains(arr2[i])) {
				list.add(arr2[i]);
			}
		}
		System.out.println(list);
		
	}
}
