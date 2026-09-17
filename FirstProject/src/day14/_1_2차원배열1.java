package day14;

import java.util.Arrays;

public class _1_2차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][5];
		// {0, 0, 0, 0, 0},
		// {0, 0, 0, 99, 0},
		// {0, 0, 0, 0, 0}
		arr[1][3] = 99;
		System.out.println(arr.length); // 행의 개수
		System.out.println(arr[0].length); // 0번행의 열의 개수
		System.out.println(Arrays.toString(arr[1]));
		
		// 3행 5열
		int arr2[][] = {
				{3,5,2,4,1},
				{2,5,9,8,1},
				{4,9,7,5,2}
		};
		
		
	}

}
