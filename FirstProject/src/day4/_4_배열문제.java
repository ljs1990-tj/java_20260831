package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _4_배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 입력받은 숫자를 배열에 저장
		// 1부터 100사이 값이 아닐 경우 다시 입력하도록
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		// {5, -20, 0, 0, 0}
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			arr[i] = input;
			if(input < 1 || input > 100) {
				i--;
				System.err.println("1부터 100사이 값 입력하셈");
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
