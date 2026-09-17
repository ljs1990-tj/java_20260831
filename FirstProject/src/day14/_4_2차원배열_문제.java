package day14;

import java.util.Arrays;
import java.util.Random;

public class _4_2차원배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[][] = new int[4][4];
		
		for(int i=1; i<=10; i++) {
			int x = ran.nextInt(4);
			int y = ran.nextInt(4);
			if(arr[x][y] != 0) {
				i--;
				continue;
			}
			arr[x][y] = i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	
	}

}
