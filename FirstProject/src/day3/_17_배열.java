package day3;

import java.util.Arrays;

public class _17_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 1, 7, 4};
		
		int temp = arr[0]; // temp = 3
		arr[0] = arr[3]; // {7, 5, 1, 7, 4}
		arr[3] = temp; // // {7, 5, 1, 3, 4}
		
		System.out.println(Arrays.toString(arr));
		
		
		// {7, 5, 1, 3, 4};
	}
}
