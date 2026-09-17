package day14;

import java.util.Arrays;

public class _2_2차원배열_문제 {
	public static void main(String[] args) {
		int arr[][] = new int[3][5];
		// {1, 2, 3, ..,..},
		// {...},
		// {..., 13, 14, 15}
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}
}
