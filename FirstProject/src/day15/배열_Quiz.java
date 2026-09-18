package day15;

import java.util.Arrays;
import java.util.Random;

public class 배열_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				int ranNum = ran.nextInt(10)+1;
				arr[i][j] = ranNum;
				
				arr[i][3] += ranNum;
				arr[3][j] += ranNum;
				arr[3][3] += ranNum;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}
}
