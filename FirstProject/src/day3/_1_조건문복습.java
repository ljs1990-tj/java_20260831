package day3;

import java.util.Scanner;

public class _1_조건문복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너
		Scanner scan = new Scanner(System.in);
		
		// 단일 if, if ~ else, if ~ else if ~ else
		
		// 1. 단일 if => 스캐너로 입력받은 숫자가 100이상이면 '큰 수' 출력
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		if(num >= 100) {
//			System.out.println("큰 수");
//		} // if
		
		
		// 2. if~else 
		// => 입력받은 숫자가 100이상이면 '큰 수' 출력, 아니면 '작은 수'
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		if(num >= 100) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		}
		
		
	} // main
} // class
