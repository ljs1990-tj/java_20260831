package day5;

import java.util.Arrays;

public class _7_Value_Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int newNum = num;
		newNum = 200;
		
		System.out.println("num : " + num);
		System.out.println("newNum : " + newNum);
		
		int arr[] = {3, 5, 2, 4, 1};
		int newArr[] = arr; 
		newArr[2] = 200;
		System.out.println(arr + " " + newArr);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("newArr : " + Arrays.toString(newArr));
		
	}
}
